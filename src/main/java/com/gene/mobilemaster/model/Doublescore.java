package com.gene.mobilemaster.model;

import java.util.Date;

public class Doublescore {
    private Long flowid;

    private String orderid;

    private String orderprice;

    private String giftscore;

    private Date addtime;

    public Long getFlowid() {
        return flowid;
    }

    public void setFlowid(Long flowid) {
        this.flowid = flowid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getOrderprice() {
        return orderprice;
    }

    public void setOrderprice(String orderprice) {
        this.orderprice = orderprice == null ? null : orderprice.trim();
    }

    public String getGiftscore() {
        return giftscore;
    }

    public void setGiftscore(String giftscore) {
        this.giftscore = giftscore == null ? null : giftscore.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}