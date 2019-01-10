package com.springboot.thhDemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table(name = "sys_user_role")
public class UserAndRole {

    @Id
    public Long Id;

    @Column(name = "user_id")
    public BigInteger user_id;

    @Column(name = "role_id")
    public BigInteger role_id;

    public UserAndRole(BigInteger user_id, BigInteger role_id) {
        this.user_id = user_id;
        this.role_id = role_id;
    }

    public BigInteger getUser_id() {
        return user_id;
    }

    public void setUser_id(BigInteger user_id) {
        this.user_id = user_id;
    }

    public BigInteger getRole_id() {
        return role_id;
    }

    public void setRole_id(BigInteger role_id) {
        this.role_id = role_id;
    }
}
