package com.gene.mobilemaster.model;

import java.util.Date;

public class Adverstisement_log_pv {
    private Double id;

    private String title;

    private Integer adtype;

    private Integer kidlocation;

    private Integer subchannel;

    private Integer visitcount;

    private Date addtime;

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getAdtype() {
        return adtype;
    }

    public void setAdtype(Integer adtype) {
        this.adtype = adtype;
    }

    public Integer getKidlocation() {
        return kidlocation;
    }

    public void setKidlocation(Integer kidlocation) {
        this.kidlocation = kidlocation;
    }

    public Integer getSubchannel() {
        return subchannel;
    }

    public void setSubchannel(Integer subchannel) {
        this.subchannel = subchannel;
    }

    public Integer getVisitcount() {
        return visitcount;
    }

    public void setVisitcount(Integer visitcount) {
        this.visitcount = visitcount;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}