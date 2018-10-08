package com.springboot.thhDemo.shiro;

import com.springboot.thhDemo.model.User;
import com.springboot.thhDemo.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

public class UserRealm extends AuthorizingRealm{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        logger.info("in author =====================");
        String str = (String)principals.getPrimaryPrincipal();
        Subject subject = SecurityUtils.getSubject();
        logger.info("str====="+str);
        logger.info("");
        Set<String> roleSet = new HashSet<String>();
        roleSet.add("ROLE_ADMIN");
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.setRoles(roleSet);
        Set tempSet = simpleAuthorizationInfo.getObjectPermissions();
        logger.info("permission ============");
        logger.info(tempSet.toString());
//        simpleAuthorizationInfo.setStringPermissions();
        logger.info("sinpmeAuthorizationInfo"+simpleAuthorizationInfo.getRoles()+simpleAuthorizationInfo.getStringPermissions());
        return simpleAuthorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo (AuthenticationToken authenticationToken) throws AuthenticationException{
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) authenticationToken;
        String username = usernamePasswordToken.getUsername();
        String password = usernamePasswordToken.getPassword().toString();
        User user = userService.userAuthenByUserName(username);
        logger.info("username"+user.getUsername());
        Session session = SecurityUtils.getSubject().getSession();
        session.setAttribute("user",user);
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(user.getUsername(),user.getPassword(),getName());
        return simpleAuthenticationInfo;
    }
}
