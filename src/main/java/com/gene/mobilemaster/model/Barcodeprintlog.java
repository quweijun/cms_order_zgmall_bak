package com.gene.mobilemaster.model;

import java.util.Date;

public class Barcodeprintlog {
    private Long flowid;

    private String startcode;

    private String endcode;

    private Date addtime;

    private String addor;

    public Long getFlowid() {
        return flowid;
    }

    public void setFlowid(Long flowid) {
        this.flowid = flowid;
    }

    public String getStartcode() {
        return startcode;
    }

    public void setStartcode(String startcode) {
        this.startcode = startcode == null ? null : startcode.trim();
    }

    public String getEndcode() {
        return endcode;
    }

    public void setEndcode(String endcode) {
        this.endcode = endcode == null ? null : endcode.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getAddor() {
        return addor;
    }

    public void setAddor(String addor) {
        this.addor = addor == null ? null : addor.trim();
    }
}