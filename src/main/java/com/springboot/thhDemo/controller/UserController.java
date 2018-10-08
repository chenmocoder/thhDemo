package com.springboot.thhDemo.controller;

import com.springboot.thhDemo.model.User;
import com.springboot.thhDemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserService userService;

    @RequestMapping(value = "/userList")
    public List userList() {
        List userList = new ArrayList();
        return userList;
    }

    @RequestMapping(value = "/addUser")
    public String addUser() {
        User user = new User();
        user.setUsername("test001");
        user.setPassword("123123");
        user.setLabel("gentleman");
        userService.initUser();
//        repository.save(user);
        return "{'msg':'success!'}";
    }
}
