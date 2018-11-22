package com.gene.mobilemaster.model;

import java.util.Date;

public class Saleslog {
    private Integer saleslogid;

    private String username;

    private String barcodeid;

    private String salesmake;

    private String remark;

    private Date logtime;

    public Integer getSaleslogid() {
        return saleslogid;
    }

    public void setSaleslogid(Integer saleslogid) {
        this.saleslogid = saleslogid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getBarcodeid() {
        return barcodeid;
    }

    public void setBarcodeid(String barcodeid) {
        this.barcodeid = barcodeid == null ? null : barcodeid.trim();
    }

    public String getSalesmake() {
        return salesmake;
    }

    public void setSalesmake(String salesmake) {
        this.salesmake = salesmake == null ? null : salesmake.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getLogtime() {
        return logtime;
    }

    public void setLogtime(Date logtime) {
        this.logtime = logtime;
    }
}