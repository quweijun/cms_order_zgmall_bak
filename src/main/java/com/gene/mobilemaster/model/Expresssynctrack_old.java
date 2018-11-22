package com.gene.mobilemaster.model;

import java.util.Date;

public class Expresssynctrack_old {
    private Integer flowno;

    private String expressid;

    private String expresscompany;

    private Date trackdate;

    private String trackcontent;

    private Date catchtime;

    public Integer getFlowno() {
        return flowno;
    }

    public void setFlowno(Integer flowno) {
        this.flowno = flowno;
    }

    public String getExpressid() {
        return expressid;
    }

    public void setExpressid(String expressid) {
        this.expressid = expressid == null ? null : expressid.trim();
    }

    public String getExpresscompany() {
        return expresscompany;
    }

    public void setExpresscompany(String expresscompany) {
        this.expresscompany = expresscompany == null ? null : expresscompany.trim();
    }

    public Date getTrackdate() {
        return trackdate;
    }

    public void setTrackdate(Date trackdate) {
        this.trackdate = trackdate;
    }

    public String getTrackcontent() {
        return trackcontent;
    }

    public void setTrackcontent(String trackcontent) {
        this.trackcontent = trackcontent == null ? null : trackcontent.trim();
    }

    public Date getCatchtime() {
        return catchtime;
    }

    public void setCatchtime(Date catchtime) {
        this.catchtime = catchtime;
    }
}