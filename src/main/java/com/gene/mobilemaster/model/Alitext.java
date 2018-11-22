package com.gene.mobilemaster.model;

public class Alitext {
    private String orderid;

    private String paras;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getParas() {
        return paras;
    }

    public void setParas(String paras) {
        this.paras = paras == null ? null : paras.trim();
    }
}