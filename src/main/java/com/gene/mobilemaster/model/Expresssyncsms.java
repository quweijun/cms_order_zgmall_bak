package com.gene.mobilemaster.model;

import java.util.Date;

public class Expresssyncsms {
    private Integer flowno;

    private String expressid;

    private String expresscompany;

    private Date smssenddate;

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

    public Date getSmssenddate() {
        return smssenddate;
    }

    public void setSmssenddate(Date smssenddate) {
        this.smssenddate = smssenddate;
    }
}