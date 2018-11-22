package com.gene.mobilemaster.model;

import java.util.Date;

public class Beforehand_order {
    private Integer id;

    private String orderid;

    private Date yeyuedate;

    private String addor;

    private Date addtime;

    private Integer flag;

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

    public Date getYeyuedate() {
        return yeyuedate;
    }

    public void setYeyuedate(Date yeyuedate) {
        this.yeyuedate = yeyuedate;
    }

    public String getAddor() {
        return addor;
    }

    public void setAddor(String addor) {
        this.addor = addor == null ? null : addor.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}