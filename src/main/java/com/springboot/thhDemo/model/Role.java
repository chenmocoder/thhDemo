package com.springboot.thhDemo.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@Table(name = "sys_role")
public class Role {

    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long role_id;

    @Column(name = "role_name")
    public String role_name;

    @Column(name = "remark")
    public String remark;

    @Column(name = "dept_id")
    public BigInteger dept_id;

    @Column(name = "create_time")
    public Timestamp create_time;

    public Role(String role_name, String remark, BigInteger dept_id, Timestamp create_time) {
        this.role_name = role_name;
        this.remark = remark;
        this.dept_id = dept_id;
        this.create_time = create_time;
    }

    public Long getRole_id() {
        return role_id;
    }

    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BigInteger getDept_id() {
        return dept_id;
    }

    public void setDept_id(BigInteger dept_id) {
        this.dept_id = dept_id;
    }

    public Timestamp getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Timestamp create_time) {
        this.create_time = create_time;
    }
}
