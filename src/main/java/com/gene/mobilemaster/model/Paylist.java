package com.gene.mobilemaster.model;

import java.util.Date;

public class Paylist {
    private Long flowid;

    private Integer provideid;

    private Date payintime;

    private Double payinamount;

    private String bzdesc;

    public Long getFlowid() {
        return flowid;
    }

    public void setFlowid(Long flowid) {
        this.flowid = flowid;
    }

    public Integer getProvideid() {
        return provideid;
    }

    public void setProvideid(Integer provideid) {
        this.provideid = provideid;
    }

    public Date getPayintime() {
        return payintime;
    }

    public void setPayintime(Date payintime) {
        this.payintime = payintime;
    }

    public Double getPayinamount() {
        return payinamount;
    }

    public void setPayinamount(Double payinamount) {
        this.payinamount = payinamount;
    }

    public String getBzdesc() {
        return bzdesc;
    }

    public void setBzdesc(String bzdesc) {
        this.bzdesc = bzdesc == null ? null : bzdesc.trim();
    }
}