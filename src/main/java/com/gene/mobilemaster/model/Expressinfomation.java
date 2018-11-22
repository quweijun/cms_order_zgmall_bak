package com.gene.mobilemaster.model;

import java.util.Date;

public class Expressinfomation {
    private Long flowid;

    private String hycompany;

    private String expressid;

    private Date addtime;

    public Long getFlowid() {
        return flowid;
    }

    public void setFlowid(Long flowid) {
        this.flowid = flowid;
    }

    public String getHycompany() {
        return hycompany;
    }

    public void setHycompany(String hycompany) {
        this.hycompany = hycompany == null ? null : hycompany.trim();
    }

    public String getExpressid() {
        return expressid;
    }

    public void setExpressid(String expressid) {
        this.expressid = expressid == null ? null : expressid.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}