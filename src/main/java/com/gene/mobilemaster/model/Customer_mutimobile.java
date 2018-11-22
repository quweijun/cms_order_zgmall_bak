package com.gene.mobilemaster.model;

import java.util.Date;

public class Customer_mutimobile {
    private Long customerid;

    private Integer logintimes;

    private Double allccurency;

    private Double redpackets;

    private Integer ljjf;

    private Date lastlogintime;

    private String customermobile;

    private String username;

    private String customername;

    private String address;

    private Integer mobilebound;

    private Integer flag;

    private Double initallccurency;

    private Double initredpackets;

    private Integer initljjf;

    private Integer initmobilebound;

    public Long getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Long customerid) {
        this.customerid = customerid;
    }

    public Integer getLogintimes() {
        return logintimes;
    }

    public void setLogintimes(Integer logintimes) {
        this.logintimes = logintimes;
    }

    public Double getAllccurency() {
        return allccurency;
    }

    public void setAllccurency(Double allccurency) {
        this.allccurency = allccurency;
    }

    public Double getRedpackets() {
        return redpackets;
    }

    public void setRedpackets(Double redpackets) {
        this.redpackets = redpackets;
    }

    public Integer getLjjf() {
        return ljjf;
    }

    public void setLjjf(Integer ljjf) {
        this.ljjf = ljjf;
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
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

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getMobilebound() {
        return mobilebound;
    }

    public void setMobilebound(Integer mobilebound) {
        this.mobilebound = mobilebound;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Double getInitallccurency() {
        return initallccurency;
    }

    public void setInitallccurency(Double initallccurency) {
        this.initallccurency = initallccurency;
    }

    public Double getInitredpackets() {
        return initredpackets;
    }

    public void setInitredpackets(Double initredpackets) {
        this.initredpackets = initredpackets;
    }

    public Integer getInitljjf() {
        return initljjf;
    }

    public void setInitljjf(Integer initljjf) {
        this.initljjf = initljjf;
    }

    public Integer getInitmobilebound() {
        return initmobilebound;
    }

    public void setInitmobilebound(Integer initmobilebound) {
        this.initmobilebound = initmobilebound;
    }
}