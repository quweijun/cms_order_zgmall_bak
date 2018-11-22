package com.gene.mobilemaster.model;

import java.util.Date;

public class Customer_tracking {
    private String sessionid;

    private String sessionid2;

    private String channelid;

    private String customerid;

    private String pingdaoid;

    private String hdid;

    private String qgid;

    private String productid;

    private Date addtime;

    private Date updatetime;

    private String title;

    private String pageurl;

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid == null ? null : sessionid.trim();
    }

    public String getSessionid2() {
        return sessionid2;
    }

    public void setSessionid2(String sessionid2) {
        this.sessionid2 = sessionid2 == null ? null : sessionid2.trim();
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    public String getPingdaoid() {
        return pingdaoid;
    }

    public void setPingdaoid(String pingdaoid) {
        this.pingdaoid = pingdaoid == null ? null : pingdaoid.trim();
    }

    public String getHdid() {
        return hdid;
    }

    public void setHdid(String hdid) {
        this.hdid = hdid == null ? null : hdid.trim();
    }

    public String getQgid() {
        return qgid;
    }

    public void setQgid(String qgid) {
        this.qgid = qgid == null ? null : qgid.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPageurl() {
        return pageurl;
    }

    public void setPageurl(String pageurl) {
        this.pageurl = pageurl == null ? null : pageurl.trim();
    }
}