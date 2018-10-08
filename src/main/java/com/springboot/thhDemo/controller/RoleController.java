package com.springboot.thhDemo.controller;


import com.springboot.thhDemo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/role")
public class RoleController {

    @Autowired
    RoleService roleService;

    @RequestMapping(value = "/addRole")
    public String addRole() {
        roleService.createRole();
        return "{'msg':'success'}";
    }

    @RequestMapping(value = "/author")
    public String author() {

        return "{'msg':'success'}";
    }
}
