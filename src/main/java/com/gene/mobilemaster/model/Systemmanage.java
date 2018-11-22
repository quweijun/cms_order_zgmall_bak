package com.gene.mobilemaster.model;

import java.util.Date;

public class Systemmanage {
    private Integer sysid;

    private String sysname;

    private String sysbz;

    private String sysbh;

    private String sysurl;

    private Integer xh;

    private Integer isqy;

    private Date addtime;

    public Integer getSysid() {
        return sysid;
    }

    public void setSysid(Integer sysid) {
        this.sysid = sysid;
    }

    public String getSysname() {
        return sysname;
    }

    public void setSysname(String sysname) {
        this.sysname = sysname == null ? null : sysname.trim();
    }

    public String getSysbz() {
        return sysbz;
    }

    public void setSysbz(String sysbz) {
        this.sysbz = sysbz == null ? null : sysbz.trim();
    }

    public String getSysbh() {
        return sysbh;
    }

    public void setSysbh(String sysbh) {
        this.sysbh = sysbh == null ? null : sysbh.trim();
    }

    public String getSysurl() {
        return sysurl;
    }

    public void setSysurl(String sysurl) {
        this.sysurl = sysurl == null ? null : sysurl.trim();
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public Integer getIsqy() {
        return isqy;
    }

    public void setIsqy(Integer isqy) {
        this.isqy = isqy;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}