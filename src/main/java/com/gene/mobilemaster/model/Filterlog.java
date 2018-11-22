package com.gene.mobilemaster.model;

import java.util.Date;

public class Filterlog {
    private Long flowid;

    private String userid;

    private String filtercontent;

    private Date addtime;

    public Long getFlowid() {
        return flowid;
    }

    public void setFlowid(Long flowid) {
        this.flowid = flowid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getFiltercontent() {
        return filtercontent;
    }

    public void setFiltercontent(String filtercontent) {
        this.filtercontent = filtercontent == null ? null : filtercontent.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}