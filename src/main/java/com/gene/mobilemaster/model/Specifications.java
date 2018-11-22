package com.gene.mobilemaster.model;

import java.util.Date;

public class Specifications {
    private Integer id;

    private Integer spectype;

    private String spec;

    private String remark;

    private Integer flag;

    private Date addtime;

    private String addor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpectype() {
        return spectype;
    }

    public void setSpectype(Integer spectype) {
        this.spectype = spectype;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec == null ? null : spec.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
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