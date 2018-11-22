package com.gene.mobilemaster.model;

import java.util.Date;

public class Kehuduan_log {
    private Long id;

    private Integer type;

    private String customerid;

    private String customerip;

    private String useragent;

    private Integer amount;

    private String md5name;

    private Date addtime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    public String getCustomerip() {
        return customerip;
    }

    public void setCustomerip(String customerip) {
        this.customerip = customerip == null ? null : customerip.trim();
    }

    public String getUseragent() {
        return useragent;
    }

    public void setUseragent(String useragent) {
        this.useragent = useragent == null ? null : useragent.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getMd5name() {
        return md5name;
    }

    public void setMd5name(String md5name) {
        this.md5name = md5name == null ? null : md5name.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}