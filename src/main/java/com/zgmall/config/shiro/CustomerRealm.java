package com.zgmall.config.shiro;


import com.zgmall.model.customer.Customer;
import com.zgmall.service.customer.CustomerService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class  CustomerRealm extends AuthenticatingRealm {
    @Autowired
    CustomerService customerService;
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("[CustomerRealm] doGetAuthenticationInfo " + token);
        // 1. 把AuthenticationToken 转换为UsernamePasswordToken
        UsernamePasswordToken up = (UsernamePasswordToken) token;
        // 2. 从UsernamePasswordToken 中来获取username
        String username = up.getUsername();
        // 3. 调用数据库的方法，从数据库中查询username对应的用户记录
        //System.out.println("从数据库中获取userName ：" + username + " 所对应的用户信息.");
        Customer customer=new Customer();
        customer.setCustomermobile(username);
        Customer checkCustomer=customerService.get(customer);
        // 4. 若用户不存在，则可以抛出 UnknownAccoountException 异常
        if (checkCustomer==null) {
            throw new UnknownAccountException("用户不存在");
        }
        else if (checkCustomer.getFlag()==0) {
            // 5. 根据用户信息的情况，决定是否需要抛出其他的AuthencationException 异常 假设用户被锁定
            throw new LockedAccountException("用户被锁定");
        }
        // 6. 根据用户的情况，来构建AuthenticationInfo 对象并返回，通常使用的是
        // SimpleAuthenticationInfo
        AuthenticationInfo info = new SimpleAuthenticationInfo(checkCustomer, checkCustomer.getCustomerpass(), getName());
        return info;
    }

    public static void main(String[] args) {
        String hashAlgorithmName = "SHA1";
        String credentials = "123456";
        int hashIterations = 1024;
        ByteSource credentialsSalt = ByteSource.Util.bytes("admin");
        Object obj = new SimpleHash(hashAlgorithmName, credentials, credentialsSalt, hashIterations);
        System.out.println(obj);
    }
}