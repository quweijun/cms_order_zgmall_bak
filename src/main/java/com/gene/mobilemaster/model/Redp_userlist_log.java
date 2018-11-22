package com.gene.mobilemaster.model;

import java.util.Date;

public class Redp_userlist_log {
    private Long flowid;

    private Integer customerid;

    private String mobile;

    private Integer redp;

    private String givingway;

    private Date addtime;

    public Long getFlowid() {
        return flowid;
    }

    public void setFlowid(Long flowid) {
        this.flowid = flowid;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getRedp() {
        return redp;
    }

    public void setRedp(Integer redp) {
        this.redp = redp;
    }

    public String getGivingway() {
        return givingway;
    }

    public void setGivingway(String givingway) {
        this.givingway = givingway == null ? null : givingway.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}