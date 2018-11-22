package com.gene.mobilemaster.model;

import java.util.Date;

public class Browserecorder {
    private String sessionid;

    private String userid;

    private String productid;

    private String url;

    private Date browsingtime;

    private String id;

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid == null ? null : sessionid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Date getBrowsingtime() {
        return browsingtime;
    }

    public void setBrowsingtime(Date browsingtime) {
        this.browsingtime = browsingtime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }
}