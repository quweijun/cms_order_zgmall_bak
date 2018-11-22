package com.gene.mobilemaster.model;

import java.util.Date;

public class Accessstatisticstemp {
    private Long id;

    private String visitid;

    private Integer producttype;

    private String ggy;

    private String clicktype;

    private String url;

    private Date addtime;

    private Integer channelid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVisitid() {
        return visitid;
    }

    public void setVisitid(String visitid) {
        this.visitid = visitid == null ? null : visitid.trim();
    }

    public Integer getProducttype() {
        return producttype;
    }

    public void setProducttype(Integer producttype) {
        this.producttype = producttype;
    }

    public String getGgy() {
        return ggy;
    }

    public void setGgy(String ggy) {
        this.ggy = ggy == null ? null : ggy.trim();
    }

    public String getClicktype() {
        return clicktype;
    }

    public void setClicktype(String clicktype) {
        this.clicktype = clicktype == null ? null : clicktype.trim();
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

    public Integer getChannelid() {
        return channelid;
    }

    public void setChannelid(Integer channelid) {
        this.channelid = channelid;
    }
}