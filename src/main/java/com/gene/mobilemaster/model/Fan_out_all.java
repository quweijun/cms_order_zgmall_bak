package com.gene.mobilemaster.model;

import java.util.Date;

public class Fan_out_all {
    private Integer id;

    private String mobile;

    private Integer quhaosum;

    private Date sendtime;

    private Date addtime;

    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getQuhaosum() {
        return quhaosum;
    }

    public void setQuhaosum(Integer quhaosum) {
        this.quhaosum = quhaosum;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}