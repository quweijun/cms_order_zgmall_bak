package com.gene.mobilemaster.model;

import java.util.Date;

public class Order_error {
    private Long id;

    private String linkman;

    private String usermobile;

    private String mobile;

    private String error;

    private String prodids;

    private String prodnames;

    private String channelid;

    private Date addtime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public String getUsermobile() {
        return usermobile;
    }

    public void setUsermobile(String usermobile) {
        this.usermobile = usermobile == null ? null : usermobile.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error == null ? null : error.trim();
    }

    public String getProdids() {
        return prodids;
    }

    public void setProdids(String prodids) {
        this.prodids = prodids == null ? null : prodids.trim();
    }

    public String getProdnames() {
        return prodnames;
    }

    public void setProdnames(String prodnames) {
        this.prodnames = prodnames == null ? null : prodnames.trim();
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}