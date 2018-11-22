package com.gene.mobilemaster.model;

import java.util.Date;

public class Customer_tjuser {
    private Date countdate;

    private Date registertime;

    private Long customerid;

    private String username;

    private String customermobile;

    private Integer mobilebound;

    private String tjCustomermobile;

    private Long tjCustomerid;

    private String tjCustomername;

    public Date getCountdate() {
        return countdate;
    }

    public void setCountdate(Date countdate) {
        this.countdate = countdate;
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    public Long getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Long customerid) {
        this.customerid = customerid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getCustomermobile() {
        return customermobile;
    }

    public void setCustomermobile(String customermobile) {
        this.customermobile = customermobile == null ? null : customermobile.trim();
    }

    public Integer getMobilebound() {
        return mobilebound;
    }

    public void setMobilebound(Integer mobilebound) {
        this.mobilebound = mobilebound;
    }

    public String getTjCustomermobile() {
        return tjCustomermobile;
    }

    public void setTjCustomermobile(String tjCustomermobile) {
        this.tjCustomermobile = tjCustomermobile == null ? null : tjCustomermobile.trim();
    }

    public Long getTjCustomerid() {
        return tjCustomerid;
    }

    public void setTjCustomerid(Long tjCustomerid) {
        this.tjCustomerid = tjCustomerid;
    }

    public String getTjCustomername() {
        return tjCustomername;
    }

    public void setTjCustomername(String tjCustomername) {
        this.tjCustomername = tjCustomername == null ? null : tjCustomername.trim();
    }
}