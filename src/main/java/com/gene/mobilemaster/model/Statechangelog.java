package com.gene.mobilemaster.model;

import java.util.Date;

public class Statechangelog {
    private Long flowid;

    private String orderid;

    private Integer stateno;

    private Integer newstateno;

    private String userid;

    private Date adddate;

    private String remarks;

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

    public Integer getStateno() {
        return stateno;
    }

    public void setStateno(Integer stateno) {
        this.stateno = stateno;
    }

    public Integer getNewstateno() {
        return newstateno;
    }

    public void setNewstateno(Integer newstateno) {
        this.newstateno = newstateno;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Date getAdddate() {
        return adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}