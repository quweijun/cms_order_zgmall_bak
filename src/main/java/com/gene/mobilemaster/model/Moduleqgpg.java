package com.gene.mobilemaster.model;

import java.util.Date;

public class Moduleqgpg {
    private String cid;

    private Integer wap1pgid;

    private Integer wap2pgid;

    private String custurl;

    private String addor;

    private Date addtime;

    private String bzdesc;

    private String enableflag;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public Integer getWap1pgid() {
        return wap1pgid;
    }

    public void setWap1pgid(Integer wap1pgid) {
        this.wap1pgid = wap1pgid;
    }

    public Integer getWap2pgid() {
        return wap2pgid;
    }

    public void setWap2pgid(Integer wap2pgid) {
        this.wap2pgid = wap2pgid;
    }

    public String getCusturl() {
        return custurl;
    }

    public void setCusturl(String custurl) {
        this.custurl = custurl == null ? null : custurl.trim();
    }

    public String getAddor() {
        return addor;
    }

    public void setAddor(String addor) {
        this.addor = addor == null ? null : addor.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getBzdesc() {
        return bzdesc;
    }

    public void setBzdesc(String bzdesc) {
        this.bzdesc = bzdesc == null ? null : bzdesc.trim();
    }

    public String getEnableflag() {
        return enableflag;
    }

    public void setEnableflag(String enableflag) {
        this.enableflag = enableflag == null ? null : enableflag.trim();
    }
}