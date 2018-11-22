package com.gene.mobilemaster.model;

import java.util.Date;

public class Bussinessorderform_simple {
    private String orderid;

    private String channelid;

    private String orderphone;

    private Date submitdate;

    private String bussinessid;

    private Date dwcTime;

    private Date fhtime;

    private Integer submitflag;

    private Integer orderstate;

    private String hycompany;

    private String expressid;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }

    public String getOrderphone() {
        return orderphone;
    }

    public void setOrderphone(String orderphone) {
        this.orderphone = orderphone == null ? null : orderphone.trim();
    }

    public Date getSubmitdate() {
        return submitdate;
    }

    public void setSubmitdate(Date submitdate) {
        this.submitdate = submitdate;
    }

    public String getBussinessid() {
        return bussinessid;
    }

    public void setBussinessid(String bussinessid) {
        this.bussinessid = bussinessid == null ? null : bussinessid.trim();
    }

    public Date getDwcTime() {
        return dwcTime;
    }

    public void setDwcTime(Date dwcTime) {
        this.dwcTime = dwcTime;
    }

    public Date getFhtime() {
        return fhtime;
    }

    public void setFhtime(Date fhtime) {
        this.fhtime = fhtime;
    }

    public Integer getSubmitflag() {
        return submitflag;
    }

    public void setSubmitflag(Integer submitflag) {
        this.submitflag = submitflag;
    }

    public Integer getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(Integer orderstate) {
        this.orderstate = orderstate;
    }

    public String getHycompany() {
        return hycompany;
    }

    public void setHycompany(String hycompany) {
        this.hycompany = hycompany == null ? null : hycompany.trim();
    }

    public String getExpressid() {
        return expressid;
    }

    public void setExpressid(String expressid) {
        this.expressid = expressid == null ? null : expressid.trim();
    }
}