package com.gene.mobilemaster.model;

import java.util.Date;

public class Ruku_ls {
    private Double rkid;

    private Integer qcid;

    private String remark;

    private Date addtime;

    private String addor;

    public Double getRkid() {
        return rkid;
    }

    public void setRkid(Double rkid) {
        this.rkid = rkid;
    }

    public Integer getQcid() {
        return qcid;
    }

    public void setQcid(Integer qcid) {
        this.qcid = qcid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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