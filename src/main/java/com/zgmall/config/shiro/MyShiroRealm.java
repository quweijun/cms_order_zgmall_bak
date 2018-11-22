package com.zgmall.config.shiro;


import com.zgmall.model.SysUser;
import com.zgmall.service.console.SysMenuService;
import com.zgmall.service.console.SysUserService;
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
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        //查出是否有此用户
        SysUser user = sysUserService.selectAmUserByName(token.getUsername());
        if(user==null){
            throw  new UnknownAccountException();
        }
       /* if(user.getUserPassword().equals(token.getPassword())){
            throw  new IncorrectCredentialsException();
        }*/
        if(user.getState()!=1){
            throw  new LockedAccountException();
        }
        SimpleAuthenticationInfo auth = new SimpleAuthenticationInfo(user, user.getUserPassword(), getName());
        if (user.getSalt() != null) {
            auth.setCredentialsSalt(ByteSource.Util.bytes(user.getSalt()));
        }
        return auth;
    }
}
