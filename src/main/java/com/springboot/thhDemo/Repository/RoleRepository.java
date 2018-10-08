package com.springboot.thhDemo.Repository;

import com.springboot.thhDemo.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface RoleRepository extends CrudRepository<Role,Long>{

    public Role findRoleByRole(@Param("role") String role);
}
