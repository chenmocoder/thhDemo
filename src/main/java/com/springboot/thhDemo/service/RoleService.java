package com.springboot.thhDemo.service;

import com.springboot.thhDemo.Repository.RoleRepository;
import com.springboot.thhDemo.Repository.UserAndRoleRepository;
import com.springboot.thhDemo.Repository.UserRepository;
import com.springboot.thhDemo.model.Role;
import com.springboot.thhDemo.model.User;
import com.springboot.thhDemo.model.UserAndRole;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public RoleRepository roleRepository;
    @Autowired
    public UserRepository userRepository;
    @Autowired
    public UserAndRoleRepository userAndRoleRepository;

    public void createRole() {
        Role role = new Role("admin");
        roleRepository.save(role);
    }

    public void assignRoles() {
        User user = userRepository.findUserByUsername("zhangsan");
        Role role = roleRepository.findRoleByRole("admin");
        UserAndRole userAndRole = new UserAndRole(user.getId(),role.getId());
        userAndRoleRepository.save(userAndRole);
    }
}
