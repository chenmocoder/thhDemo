package com.springboot.thhDemo.model;

import javax.persistence.*;

@Entity
@Table(name = "thhDemo_role")
public class Role {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long Id;

    @Column(name = "role")
    public String role;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Role(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Role{" +
                "Id=" + Id +
                ", role='" + role + '\'' +
                '}';
    }
}
