package com.springboot.thhDemo.service;

import com.springboot.thhDemo.Repository.PermissionReporistory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermissionService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public PermissionReporistory permissionReporistory;

}
