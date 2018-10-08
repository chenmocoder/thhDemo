package com.springboot.thhDemo;


import com.springboot.thhDemo.shiro.UserRealm;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     *shiro 整个生命周期，包括init(),destory(),由spring管理
     * @return
     */
    @Bean(name = "lifecycleBeanPostProcessor")
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor () {
        logger.info("LifecycleBeanPostProcessor");
        return new LifecycleBeanPostProcessor();
    }

    /**
     * 自定义验证方式 加入speingboot 应用容器
     * user登录的自定义验证
     * @return
     */
    @Bean
    public UserRealm userRealm() {
        logger.info("UserRealm");
        UserRealm userRealm = new UserRealm();
        return userRealm;
    }

    /**
     *
     * securityManager算是shiro框架的安全操作的具体实现， 包括 ：认证、授权、seesion管理
     * DefaultSecurityManager 类的注视描述 为了简化配置，这种实现方式会创建默认的它们所需要
     * 的依赖，至少需要一个 Relams 即就是验证方式。
     * @return
     */
    @Bean(name = "securityManager")
    public DefaultWebSecurityManager securityManager() {
        logger.info("securityManager");
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(userRealm());
        return securityManager;
    }


    /**
     *
     * @return
     */
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor() {
        logger.info("AuthorizationAttributeSourceAdvisor");
        AuthorizationAttributeSourceAdvisor authAttrSourceAd =  new AuthorizationAttributeSourceAdvisor();
//        authAttrSourceAd.getSecurityManager(securityManager());
        return authAttrSourceAd;
    }

    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean() {
        logger.info("shiroFilterFactoryBean");
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager());
        Map<String,String> filterChain = new LinkedHashMap<String,String>();
        filterChain.put("/user/userList","authc,roles[ROLE_ADMIN]");
        System.out.println("in shiro config permission");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChain);
//        shiroFilterFactoryBean.setUnauthorizedUrl("/403");
        return shiroFilterFactoryBean;
    }


}
