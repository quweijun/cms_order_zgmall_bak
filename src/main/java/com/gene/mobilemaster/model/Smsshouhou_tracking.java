package com.gene.mobilemaster.model;

import java.util.Date;

public class Smsshouhou_tracking {
    private Integer flowid;

    private String orderid;

    private String mobile;

    private String zddh;

    private String mddh;

    private String mddh2;

    private String expressid;

    private String khh;

    private String yhzh;

    private Date addtime;

    public Integer getFlowid() {
        return flowid;
    }

    public void setFlowid(Integer flowid) {
        this.flowid = flowid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getZddh() {
        return zddh;
    }

    public void setZddh(String zddh) {
        this.zddh = zddh == null ? null : zddh.trim();
    }

    public String getMddh() {
        return mddh;
    }

    public void setMddh(String mddh) {
        this.mddh = mddh == null ? null : mddh.trim();
    }

    public String getMddh2() {
        return mddh2;
    }

    public void setMddh2(String mddh2) {
        this.mddh2 = mddh2 == null ? null : mddh2.trim();
    }

    public String getExpressid() {
        return expressid;
    }

    public void setExpressid(String expressid) {
        this.expressid = expressid == null ? null : expressid.trim();
    }

    public String getKhh() {
        return khh;
    }

    public void setKhh(String khh) {
        this.khh = khh == null ? null : khh.trim();
    }

    public String getYhzh() {
        return yhzh;
    }

    public void setYhzh(String yhzh) {
        this.yhzh = yhzh == null ? null : yhzh.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}