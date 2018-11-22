package com.gene.mobilemaster.model;

import java.util.Date;

public class Shopcatvisitpv_tmponhour {
    private Long id;

    private String productid;

    private String producttype;

    private String wherein;

    private Integer visitcount;

    private Date visittime;

    private Integer visithour;

    private String channelid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Integer getVisitcount() {
        return visitcount;
    }

    public void setVisitcount(Integer visitcount) {
        this.visitcount = visitcount;
    }

    public Date getVisittime() {
        return visittime;
    }

    public void setVisittime(Date visittime) {
        this.visittime = visittime;
    }

    public Integer getVisithour() {
        return visithour;
    }

    public void setVisithour(Integer visithour) {
        this.visithour = visithour;
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }
}