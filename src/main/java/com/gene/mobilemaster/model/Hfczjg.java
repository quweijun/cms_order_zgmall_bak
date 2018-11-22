package com.gene.mobilemaster.model;

import java.util.Date;

public class Hfczjg {
    private String orderid;

    private Integer status;

    private String ordermoney;

    private String verifystring;

    private Date addtime;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOrdermoney() {
        return ordermoney;
    }

    public void setOrdermoney(String ordermoney) {
        this.ordermoney = ordermoney == null ? null : ordermoney.trim();
    }

    public String getVerifystring() {
        return verifystring;
    }

    public void setVerifystring(String verifystring) {
        this.verifystring = verifystring == null ? null : verifystring.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}