package com.springboot.thhDemo.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@Table(name = "sys_user")
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long user_id;

    @Column(name = "username")
    public String username;

    @Column(name = "password")
    public  String password;

    @Column(name = "salt")
    public String salt;

    @Column(name = "email")
    public String email;

    @Column(name = "mobile")
    public String mobile;

    @Column(name = "status")
    public Integer status;

    @Column(name = "dept_id")
    public BigInteger dept_id;

    @Column(name = "create_time")
    public Timestamp create_time;

    public User() {
    }

    public User( String username, String password, String salt, String email, String mobile, Integer status, BigInteger dept_id, Timestamp create_time) {
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.email = email;
        this.mobile = mobile;
        this.status = status;
        this.dept_id = dept_id;
        this.create_time = create_time;
    }

    public Long getUser_id() {
        return user_id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getSalt() {
        return salt;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public Integer getStatus() {
        return status;
    }

    public BigInteger getDept_id() {
        return dept_id;
    }

    public Timestamp getCreate_time() {
        return create_time;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setDept_id(BigInteger dept_id) {
        this.dept_id = dept_id;
    }

    public void setCreate_time(Timestamp create_time) {
        this.create_time = create_time;
    }
}
