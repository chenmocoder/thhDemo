package com.springboot.thhDemo.Repository;

import com.springboot.thhDemo.model.UserAndRole;
import org.springframework.data.repository.CrudRepository;

public interface UserAndRoleRepository extends CrudRepository<UserAndRole,Long> {


}
