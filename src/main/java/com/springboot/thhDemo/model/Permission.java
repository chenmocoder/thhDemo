package com.springboot.thhDemo.model;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "sys_permission")
public class Permission {


    @javax.persistence.Id
    @Column(name = "permission_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public BigInteger permission_id;

    @Column(name = "parent_id")
    public BigInteger parent_id;

    @Column(name = "name")
    public String name;

    @Column(name = "url")
    public String url;

    @Column(name = "type")
    public Integer type;

    @Column(name = "order_num")
    public Integer  order_num;

    public Permission(BigInteger parent_id, String name, String url, Integer type, Integer order_num) {
        this.parent_id = parent_id;
        this.name = name;
        this.url = url;
        this.type = type;
        this.order_num = order_num;
    }

    public BigInteger getParent_id() {
        return parent_id;
    }

    public void setParent_id(BigInteger parent_id) {
        this.parent_id = parent_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getOrder_num() {
        return order_num;
    }

    public void setOrder_num(Integer order_num) {
        this.order_num = order_num;
    }
}
