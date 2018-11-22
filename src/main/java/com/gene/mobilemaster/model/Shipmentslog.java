package com.gene.mobilemaster.model;

import java.util.Date;

public class Shipmentslog {
    private Integer slid;

    private String username;

    private String ordermumber;

    private String indent;

    private String remark;

    private Date lontime;

    public Integer getSlid() {
        return slid;
    }

    public void setSlid(Integer slid) {
        this.slid = slid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getOrdermumber() {
        return ordermumber;
    }

    public void setOrdermumber(String ordermumber) {
        this.ordermumber = ordermumber == null ? null : ordermumber.trim();
    }

    public String getIndent() {
        return indent;
    }

    public void setIndent(String indent) {
        this.indent = indent == null ? null : indent.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getLontime() {
        return lontime;
    }

    public void setLontime(Date lontime) {
        this.lontime = lontime;
    }
}