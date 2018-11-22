package com.gene.mobilemaster.model;

public class Channelsettle_order_relation {
    private String settleid;

    private String orderid;

    public String getSettleid() {
        return settleid;
    }

    public void setSettleid(String settleid) {
        this.settleid = settleid == null ? null : settleid.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }
}