package com.springboot.thhDemo.service;

import com.springboot.thhDemo.Repository.RoleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public RoleRepository roleRepository;


}
