package com.gene.mobilemaster.model;

import java.util.Date;

public class Expressimportlib {
    private Long pkid;

    private String fileid;

    private String expressid;

    private Double receivable;

    private Double received;

    private String settledate;

    private Double youfeicost;

    private Double settlecost;

    private Double servercost;

    private Double backexpresscost;

    private Date adddate;

    private Integer isexist;

    public Long getPkid() {
        return pkid;
    }

    public void setPkid(Long pkid) {
        this.pkid = pkid;
    }

    public String getFileid() {
        return fileid;
    }

    public void setFileid(String fileid) {
        this.fileid = fileid == null ? null : fileid.trim();
    }

    public String getExpressid() {
        return expressid;
    }

    public void setExpressid(String expressid) {
        this.expressid = expressid == null ? null : expressid.trim();
    }

    public Double getReceivable() {
        return receivable;
    }

    public void setReceivable(Double receivable) {
        this.receivable = receivable;
    }

    public Double getReceived() {
        return received;
    }

    public void setReceived(Double received) {
        this.received = received;
    }

    public String getSettledate() {
        return settledate;
    }

    public void setSettledate(String settledate) {
        this.settledate = settledate == null ? null : settledate.trim();
    }

    public Double getYoufeicost() {
        return youfeicost;
    }

    public void setYoufeicost(Double youfeicost) {
        this.youfeicost = youfeicost;
    }

    public Double getSettlecost() {
        return settlecost;
    }

    public void setSettlecost(Double settlecost) {
        this.settlecost = settlecost;
    }

    public Double getServercost() {
        return servercost;
    }

    public void setServercost(Double servercost) {
        this.servercost = servercost;
    }

    public Double getBackexpresscost() {
        return backexpresscost;
    }

    public void setBackexpresscost(Double backexpresscost) {
        this.backexpresscost = backexpresscost;
    }

    public Date getAdddate() {
        return adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }

    public Integer getIsexist() {
        return isexist;
    }

    public void setIsexist(Integer isexist) {
        this.isexist = isexist;
    }
}