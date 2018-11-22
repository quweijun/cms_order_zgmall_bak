package com.gene.mobilemaster.model;

import java.util.Date;

public class Customeroperation {
    private Integer id;

    private String orderid;

    private String hisUser;

    private String newUser;

    private String updateUser;

    private Date upDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getHisUser() {
        return hisUser;
    }

    public void setHisUser(String hisUser) {
        this.hisUser = hisUser == null ? null : hisUser.trim();
    }

    public String getNewUser() {
        return newUser;
    }

    public void setNewUser(String newUser) {
        this.newUser = newUser == null ? null : newUser.trim();
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Date getUpDate() {
        return upDate;
    }

    public void setUpDate(Date upDate) {
        this.upDate = upDate;
    }
}