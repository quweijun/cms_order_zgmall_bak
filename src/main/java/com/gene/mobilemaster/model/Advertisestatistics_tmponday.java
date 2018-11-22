package com.gene.mobilemaster.model;

import java.util.Date;

public class Advertisestatistics_tmponday {
    private Double id;

    private Integer adid;

    private String title;

    private Integer adtype;

    private Date visittime;

    private Integer visitcount;

    private Integer visitcount2;

    private Integer notruevisitcount;

    private Integer notruevisitcount2;

    private Integer kidlocation;

    private Integer subchannel;

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public Integer getAdid() {
        return adid;
    }

    public void setAdid(Integer adid) {
        this.adid = adid;
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

    public Date getVisittime() {
        return visittime;
    }

    public void setVisittime(Date visittime) {
        this.visittime = visittime;
    }

    public Integer getVisitcount() {
        return visitcount;
    }

    public void setVisitcount(Integer visitcount) {
        this.visitcount = visitcount;
    }

    public Integer getVisitcount2() {
        return visitcount2;
    }

    public void setVisitcount2(Integer visitcount2) {
        this.visitcount2 = visitcount2;
    }

    public Integer getNotruevisitcount() {
        return notruevisitcount;
    }

    public void setNotruevisitcount(Integer notruevisitcount) {
        this.notruevisitcount = notruevisitcount;
    }

    public Integer getNotruevisitcount2() {
        return notruevisitcount2;
    }

    public void setNotruevisitcount2(Integer notruevisitcount2) {
        this.notruevisitcount2 = notruevisitcount2;
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
}