package com.zgmall.config.shiro;

import com.zgmall.config.filter.LoginFilter;
import com.zgmall.model.SysPermissionInit;
import com.zgmall.service.console.SysPermissionService;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authc.pam.AtLeastOneSuccessfulStrategy;
import org.apache.shiro.authc.pam.ModularRealmAuthenticator;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.CookieRememberMeManager;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.crazycake.shiro.RedisCacheManager;
import org.crazycake.shiro.RedisManager;

import javax.servlet.Filter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
@Configuration
public class ShiroConfig {
    @Autowired
    SysPermissionService sysPermissionService;

    @Bean(name = "shiroFilter")
    public ShiroFilterFactoryBean shirFilter(SecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        // 必须设置 SecurityManager
        shiroFilterFactoryBean.setSecurityManager(securityManager);

        // 必须设置 SecurityManager
//        shiroFilterFactoryBean.setSecurityManager(securityManager);
        // 如果不设置默认会自动寻找Web工程根目录下的"/login.jsp"页面
        //shiroFilterFactoryBean.setLoginUrl(SSO_URL);
        // 登录成功后要跳转的链接
        //shiroFilterFactoryBean.setSuccessUrl("/index");
        // 未授权界面;
        //shiroFilterFactoryBean.setUnauthorizedUrl(PUB_HTTP_UI+"/#/unauthorized");

        //自定义拦截器
        Map<String, Filter> filtersMap = new LinkedHashMap<String, Filter>();
        filtersMap.put("authc", new LoginFilter());
        shiroFilterFactoryBean.setFilters(filtersMap);

        //页面权限配置从SysPermissionInit表
        List<SysPermissionInit> list = sysPermissionService.getSysPermissionInitAll();
        Map<String, String> filterChainDefinitionMap = new LinkedHashMap<String, String>();
        //通过SysPermissionInit配置表获取URL权限配置
        for (SysPermissionInit amPermissionInit : list) {
            filterChainDefinitionMap.put(amPermissionInit.getUrl(),
                    amPermissionInit.getPermissionInit());
        }
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return shiroFilterFactoryBean;
    }


    @Bean
    public SecurityManager securityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        //支持多个realm Begin
        securityManager.setRealm(myShiroRealm());
        List<Realm> realms=new ArrayList<>();
        realms.add(myShiroRealm());
        //realms.add(customerRealm());
        securityManager.setRealms(realms);
        //End
        //支持单个realm Begin
        //securityManager.setRealm(myShiroRealm());
        //End
        // 注入缓存管理器; 方式1：使用ehcache缓存
        //securityManager.setCacheManager(ehCacheManager());// 这个如果执行多次，也是同样的一个对象;
        // 注入缓存管理器; 方式2：使用redis缓存
        securityManager.setCacheManager(redisCacheManager());// 这个如果执行多次，也是同样的一个对象;

        // 注入记住我管理器;
        securityManager.setRememberMeManager(rememberMeManager());
        return securityManager;
    }

    // 导入自定义 realm
    @Bean
    public MyShiroRealm myShiroRealm() {
        MyShiroRealm myShiroRealm = new MyShiroRealm();
        //加密
        myShiroRealm.setCredentialsMatcher(hashedCredentialsMatcher());
        //设定使用登录缓存
        myShiroRealm.setAuthenticationCachingEnabled(true);
        return myShiroRealm;
    }

    //导入自定义 CustomerRealm
    @Bean
    public CustomerRealm customerRealm(){
        CustomerRealm customerRealm=new CustomerRealm();
        //加密
        customerRealm.setCredentialsMatcher(hashedCredentialsMatcher());
        return customerRealm;
    }

    @Bean(name = "hashedCredentialsMatcher")
    public HashedCredentialsMatcher hashedCredentialsMatcher() {
        HashedCredentialsMatcher credentialsMatcher = new HashedCredentialsMatcher();
        credentialsMatcher.setHashAlgorithmName("MD5");
        credentialsMatcher.setHashIterations(2);
        credentialsMatcher.setStoredCredentialsHexEncoded(true);
        return credentialsMatcher;
    }


    // 授权注解 @RequiresPermissions("userInfo:del")//权限管理;
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
        return authorizationAttributeSourceAdvisor;
    }

    @Bean
    public DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator() {
        DefaultAdvisorAutoProxyCreator creator = new DefaultAdvisorAutoProxyCreator();
        creator.setProxyTargetClass(true);
        return creator;
    }
    /**
     * 配置shiro ehCache 缓存
     * 使用的是shiro-redis开源插件
     */
    @Bean
    public EhCacheManager ehCacheManager() {
        System.out.println("ShiroConfiguration.getEhCacheManager()");
        EhCacheManager cacheManager = new EhCacheManager();
        cacheManager.setCacheManagerConfigFile("classpath:ehcache-shiro.xml");
        return cacheManager;
    }

    /**
     * cacheManager 缓存 redis实现
     * 使用的是shiro-redis开源插件
     *
     * @return
     */
    @Bean
    public RedisCacheManager redisCacheManager() {
        RedisCacheManager redisCacheManager = new RedisCacheManager();
        redisCacheManager.setRedisManager(redisManager());
        return redisCacheManager;
    }
    /**
     * 配置shiro redisManager
     * 使用的是shiro-redis开源插件
     */
    @Bean
    public RedisManager redisManager() {
        RedisManager redisManager = new RedisManager();
        redisManager.setHost("127.0.0.1");
        redisManager.setPort(6379);
        redisManager.setExpire(1800);// 配置缓存过期时间
        redisManager.setTimeout(1000);
        // redisManager.setPassword(password);
        return redisManager;
    }

    @Bean
    public SimpleCookie rememberMeCookie() {
        // 这个参数是cookie的名称，对应前端的checkbox的name = rememberMe
        SimpleCookie simpleCookie = new SimpleCookie("rememberMe");
        // <!-- 记住我cookie生效时间30天 ,单位秒;-->
        simpleCookie.setMaxAge(259200);
        return simpleCookie;
    }
    @Bean
    public CookieRememberMeManager rememberMeManager() {
        CookieRememberMeManager cookieRememberMeManager = new CookieRememberMeManager();
        cookieRememberMeManager.setCookie(rememberMeCookie());
        return cookieRememberMeManager;
    }



}
