package com.zgmall.config.shiro;


import com.zgmall.model.SysUser;
import com.zgmall.model.customer.Customer;
import com.zgmall.service.console.SysMenuService;
import com.zgmall.service.console.SysUserService;
import com.zgmall.service.customer.CustomerService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;
@Component
public class MyShiroRealm extends AuthorizingRealm {
    @Autowired
    SysUserService sysUserService;
    @Autowired
    SysMenuService sysMenuService;
    @Autowired
    CustomerService customerService;
    /** 授权*/
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        // 从principals里面获取主身份信息 getPrimaryPrincipal返回类型强转为登录信息类型
        SysUser sysUser = (SysUser) principals.getPrimaryPrincipal();
        //根据身份信息获取权限信息
        Set<String> permissionList=sysMenuService.selectAllPerms(sysUser);
        //查到权限数据返回
        SimpleAuthorizationInfo simpleAuthorizationInfo=new SimpleAuthorizationInfo();
        //将上面查询到的授权信息填充到simpleAuthorizationInfo中
        simpleAuthorizationInfo.addStringPermissions(permissionList);
        return simpleAuthorizationInfo;
    }

    /**
     * 登录
     *
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) {
        //设定使用登录缓存
        this.setAuthenticationCachingEnabled(true);
        //UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        //替换成CustomLoginToken，获取logintype
        CustomLoginToken token = (CustomLoginToken) authenticationToken;
        //查出是否有此用户,获取用户对象
        SimpleAuthenticationInfo auth=null;
        if (token.getLoginType()==UserType.ERPUSER) {
            SysUser user = sysUserService.selectAmUserByName(token.getUsername());
            if(user==null){
                throw  new UnknownAccountException();
            }
            if(user.getState()!=1){
                throw  new LockedAccountException();
            }
            //将从数据库获取的用户对象放入auth对象，返回与登录的token校验
            auth = new SimpleAuthenticationInfo(user, user.getUserPassword(), getName());
            if (user.getSalt() != null) {
                //auth.setCredentialsSalt(ByteSource.Util.bytes(user.getSalt()));
                //使用自定义的序列化ByteSourceUtils工具类替换原有类
                auth.setCredentialsSalt(ByteSourceUtils.bytes(user.getSalt()));
            }
         }
        else if (token.getLoginType()==UserType.CUSTOMER) {
            Customer customer=new Customer();
            customer.setCustomermobile(token.getUsername());
            Customer cust2=(Customer)customerService.get(customer);
            if(cust2==null){
                throw  new UnknownAccountException();
            }
            if(cust2.getFlag()!=1){
                throw  new LockedAccountException();
            }
            //将从数据库获取的用户对象放入auth对象，返回与登录的token校验
            auth = new SimpleAuthenticationInfo(cust2,cust2.getCustomerpass(), getName());
            //auth = new SimpleAuthenticationInfo(cust2.getCustomermobile(),cust2.getCustomerpass(), getName());
            //加盐
            if (cust2.getSalt() != null) {
                //auth.setCredentialsSalt(ByteSource.Util.bytes(cust2.getSalt()));
                //使用自定义的序列化ByteSourceUtils工具类替换原有类
                auth.setCredentialsSalt(ByteSourceUtils.bytes(cust2.getSalt()));
            }
//            if (user.getSalt() != null) {
//                auth.setCredentialsSalt(ByteSource.Util.bytes(user.getSalt()));
//            }
        }
//        SysUser user = sysUserService.selectAmUserByName(token.getUsername());
//        if(user==null){
//            throw  new UnknownAccountException();
//        }
//       /* if(user.getUserPassword().equals(token.getPassword())){
//            throw  new IncorrectCredentialsException();
//        }*/
//        if(user.getState()!=1){
//            throw  new LockedAccountException();
//        }
//        //将从数据库获取的用户对象放入auth对象，返回与登录的token校验
//        SimpleAuthenticationInfo auth = new SimpleAuthenticationInfo(user, user.getUserPassword(), getName());
//        if (user.getSalt() != null) {
//            auth.setCredentialsSalt(ByteSource.Util.bytes(user.getSalt()));
//        }
        return auth;
    }
}
