package com.springboot.thhDemo.login;


import com.springboot.thhDemo.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
public class LoginController {

    @Autowired
    UserService userService;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(HttpServletRequest req, HttpServletResponse res) {

        HttpSession session = req.getSession();
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(req.getParameter("username"),req.getParameter("password"));
        logger.info("in login authen");
        subject.login(token);
        logger.info(JSONObject.valueToString(subject.getSession().getAttribute("user")));
        return "hello everone";
    }

}
