package com.gene.mobilemaster.model;

import java.util.Date;

public class Prodinfo {
    private Long id;

    private String pid;

    private Integer type;

    private String proddesc;

    private Long photoid;

    private Date addtime;

    private String addor;

    private Long colorversionphotoid;

    private Integer serialnumber;

    private Byte enableflag;

    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getProddesc() {
        return proddesc;
    }

    public void setProddesc(String proddesc) {
        this.proddesc = proddesc == null ? null : proddesc.trim();
    }

    public Long getPhotoid() {
        return photoid;
    }

    public void setPhotoid(Long photoid) {
        this.photoid = photoid;
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

    public Long getColorversionphotoid() {
        return colorversionphotoid;
    }

    public void setColorversionphotoid(Long colorversionphotoid) {
        this.colorversionphotoid = colorversionphotoid;
    }

    public Integer getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(Integer serialnumber) {
        this.serialnumber = serialnumber;
    }

    public Byte getEnableflag() {
        return enableflag;
    }

    public void setEnableflag(Byte enableflag) {
        this.enableflag = enableflag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}