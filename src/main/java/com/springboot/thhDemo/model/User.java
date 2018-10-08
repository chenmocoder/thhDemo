package com.springboot.thhDemo.model;

import javax.persistence.*;

@Entity
@Table(name = "thhDemo_user")
public class User {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long Id;

    @Column(name = "username")
    public String username;

    public User() {
    }

    public User(String username, String password, String label) {
        this.username = username;
        this.password = password;
        this.label = label;
    }

    @Column(name = "password")
    public String password;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    @Column(name = "label")
    public String label;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
