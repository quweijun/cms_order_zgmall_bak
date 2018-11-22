package com.gene.mobilemaster.model;

import java.util.Date;

public class Customer_temp_mobile {
    private Long customerTempId;

    private String customermobile;

    private String username;

    private String address;

    private Date registertime;

    private Date lastlogintime;

    private Integer logintimes;

    private Long customerid;

    public Long getCustomerTempId() {
        return customerTempId;
    }

    public void setCustomerTempId(Long customerTempId) {
        this.customerTempId = customerTempId;
    }

    public String getCustomermobile() {
        return customermobile;
    }

    public void setCustomermobile(String customermobile) {
        this.customermobile = customermobile == null ? null : customermobile.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public Integer getLogintimes() {
        return logintimes;
    }

    public void setLogintimes(Integer logintimes) {
        this.logintimes = logintimes;
    }

    public Long getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Long customerid) {
        this.customerid = customerid;
    }
}