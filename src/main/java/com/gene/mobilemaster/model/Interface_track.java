package com.gene.mobilemaster.model;

import java.util.Date;

public class Interface_track {
    Long flowid;

    private String interface2;

    private String ip;

    private Date addtime;

    public Long getFlowid() {
        return flowid;
    }

    public void setFlowid(Long flowid) {
        this.flowid = flowid;
    }

    public String getInterface() {
        return interface2;
    }

    public void setInterface(String interface2) {
        this.interface2 = interface2 == null ? null : interface2.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}