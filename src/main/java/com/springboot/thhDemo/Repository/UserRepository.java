package com.springboot.thhDemo.Repository;

import com.springboot.thhDemo.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Long> {

    User findUserByUsername(String username);

    @Query(value = "select '*' from thh_demo_user user  join thh_demo_userandrole userandrole " +
            " on  user.id = userandrole.user_id  join thh_demo_role role on userandrole.role_id = role.id " +
            " where user.username = :username",nativeQuery = true)
    public List<Object> findAuthenInfoByUsername(@Param("username") String username);

}
