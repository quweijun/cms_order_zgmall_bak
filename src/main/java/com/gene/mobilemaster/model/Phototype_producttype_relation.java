package com.gene.mobilemaster.model;

import java.util.Date;

public class Phototype_producttype_relation {
    private Integer id;

    private Integer bigtype;

    private Integer pictypeid;

    private Integer enableflag;

    private String adduser;

    private Date addtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBigtype() {
        return bigtype;
    }

    public void setBigtype(Integer bigtype) {
        this.bigtype = bigtype;
    }

    public Integer getPictypeid() {
        return pictypeid;
    }

    public void setPictypeid(Integer pictypeid) {
        this.pictypeid = pictypeid;
    }

    public Integer getEnableflag() {
        return enableflag;
    }

    public void setEnableflag(Integer enableflag) {
        this.enableflag = enableflag;
    }

    public String getAdduser() {
        return adduser;
    }

    public void setAdduser(String adduser) {
        this.adduser = adduser == null ? null : adduser.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}