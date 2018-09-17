package com.springboot.thhDemo.service;

import com.springboot.thhDemo.Repository.UserRepository;
import com.springboot.thhDemo.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService{


    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public UserRepository repository;

    public User userAuthenByUserName(String username) {
        User user = new User();
        logger.info("service username ==" + username);
        if(username.equals("test001")) {
            user.setUsername("test001");
            user.setPassword("123123");
            user.setLabel("happy person ");
        }
        return user;
    }

    public User createUser(Long userId,String username,String password,String label) {
        User user = new User();
        user.setId(userId);
        user.setLabel(label);
        user.setUsername(username);
        return user;
    }

    public void initUser() {
        User user = new User();
        user.setUsername("zhangsan");
        user.setPassword("123456789");
        user.setLabel("gentleman");
        logger.info(user.toString());
        User ruser = repository.save(user);
        logger.info(ruser.toString());
    }

}
