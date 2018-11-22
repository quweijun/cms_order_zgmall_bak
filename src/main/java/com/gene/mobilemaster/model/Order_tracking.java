package com.gene.mobilemaster.model;

import java.util.Date;

public class Order_tracking {
    private Long flowno;

    private String orderid;

    private String userid;

    private Integer orderstate1;

    private Integer orderstate2;

    private Integer payment1;

    private Integer payment2;

    private Date updatetime;

    private String notes;

    public Long getFlowno() {
        return flowno;
    }

    public void setFlowno(Long flowno) {
        this.flowno = flowno;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getOrderstate1() {
        return orderstate1;
    }

    public void setOrderstate1(Integer orderstate1) {
        this.orderstate1 = orderstate1;
    }

    public Integer getOrderstate2() {
        return orderstate2;
    }

    public void setOrderstate2(Integer orderstate2) {
        this.orderstate2 = orderstate2;
    }

    public Integer getPayment1() {
        return payment1;
    }

    public void setPayment1(Integer payment1) {
        this.payment1 = payment1;
    }

    public Integer getPayment2() {
        return payment2;
    }

    public void setPayment2(Integer payment2) {
        this.payment2 = payment2;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }
}