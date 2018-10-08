package com.springboot.thhDemo.model;

import javax.persistence.*;

@Entity
@Table(name = "thhDemo_permission")
public class Permission {


    @javax.persistence.Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long Id;

    @Column(name = "permname")
    public String permName;

    @Column(name = "permstring")
    public String permString;
}
