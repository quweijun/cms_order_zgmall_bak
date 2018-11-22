package com.gene.mobilemaster.model;

import java.util.Date;

public class Ontime_interface {
    private Long flowid;

    private String orderid;

    private String url;

    private Date addtime;

    private String backvalue;

    private String waptype;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getBackvalue() {
        return backvalue;
    }

    public void setBackvalue(String backvalue) {
        this.backvalue = backvalue == null ? null : backvalue.trim();
    }

    public String getWaptype() {
        return waptype;
    }

    public void setWaptype(String waptype) {
        this.waptype = waptype == null ? null : waptype.trim();
    }
}