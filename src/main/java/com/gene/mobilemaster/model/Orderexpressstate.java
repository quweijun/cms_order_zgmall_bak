package com.gene.mobilemaster.model;

import java.util.Date;

public class Orderexpressstate {
    private Long flowid;

    private String orderid;

    private Date forecastarrive;

    private Date fhtime;

    private Integer stateno;

    private Date nextcheck;

    private Integer issent;

    private Date adddate;

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

    public Date getForecastarrive() {
        return forecastarrive;
    }

    public void setForecastarrive(Date forecastarrive) {
        this.forecastarrive = forecastarrive;
    }

    public Date getFhtime() {
        return fhtime;
    }

    public void setFhtime(Date fhtime) {
        this.fhtime = fhtime;
    }

    public Integer getStateno() {
        return stateno;
    }

    public void setStateno(Integer stateno) {
        this.stateno = stateno;
    }

    public Date getNextcheck() {
        return nextcheck;
    }

    public void setNextcheck(Date nextcheck) {
        this.nextcheck = nextcheck;
    }

    public Integer getIssent() {
        return issent;
    }

    public void setIssent(Integer issent) {
        this.issent = issent;
    }

    public Date getAdddate() {
        return adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }
}