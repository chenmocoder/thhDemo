package com.springboot.thhDemo.Repository;

import com.springboot.thhDemo.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

    User findUserByUsername();


}
