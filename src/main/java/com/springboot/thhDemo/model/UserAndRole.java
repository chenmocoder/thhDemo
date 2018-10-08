package com.springboot.thhDemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "thhDemo_userandrole")
public class UserAndRole {

    @Id
    public Long Id;

    @Column(name = "userId")
    public Long userId;

    @Column(name = "roleId")
    public Long RoleId;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return RoleId;
    }

    public void setRoleId(Long roleId) {
        RoleId = roleId;
    }

    public UserAndRole(Long id, Long userId, Long roleId) {
        Id = id;
        this.userId = userId;
        RoleId = roleId;
    }

    @Override
    public String toString() {
        return "UserAndRole{" +
                "Id=" + Id +
                ", userId=" + userId +
                ", RoleId=" + RoleId +
                '}';
    }
}
