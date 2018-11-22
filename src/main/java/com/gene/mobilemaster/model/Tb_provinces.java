package com.gene.mobilemaster.model;

public class Tb_provinces {
    private Integer flowid;

    private String provincesname;

    public Integer getFlowid() {
        return flowid;
    }

    public void setFlowid(Integer flowid) {
        this.flowid = flowid;
    }

    public String getProvincesname() {
        return provincesname;
    }

    public void setProvincesname(String provincesname) {
        this.provincesname = provincesname == null ? null : provincesname.trim();
    }
}