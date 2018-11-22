package com.gene.mobilemaster.model;

import java.util.Date;

public class Shopcatvisittemp {
    private Integer id;

    private String productid;

    private String producttype;

    private String wherein;

    private Date visittime;

    private Integer channelid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype == null ? null : producttype.trim();
    }

    public String getWherein() {
        return wherein;
    }

    public void setWherein(String wherein) {
        this.wherein = wherein == null ? null : wherein.trim();
    }

    public Date getVisittime() {
        return visittime;
    }

    public void setVisittime(Date visittime) {
        this.visittime = visittime;
    }

    public Integer getChannelid() {
        return channelid;
    }

    public void setChannelid(Integer channelid) {
        this.channelid = channelid;
    }
}