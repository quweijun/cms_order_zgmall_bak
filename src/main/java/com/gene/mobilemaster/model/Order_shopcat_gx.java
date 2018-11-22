package com.gene.mobilemaster.model;

import java.util.Date;

public class Order_shopcat_gx {
    private String orderid;

    private String md5name;

    private Date addtime;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
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