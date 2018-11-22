package com.gene.mobilemaster.model;

import java.util.Date;

public class Phototype {
    private Long id;

    private Integer pictypeid;

    private String pictypename;

    private Integer picedition;

    private String picpath;

    private String picurlpath;

    private Integer enableflag;

    private String adduser;

    private Date addtime;

    private Integer showflag;

    private Integer showorder;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPictypeid() {
        return pictypeid;
    }

    public void setPictypeid(Integer pictypeid) {
        this.pictypeid = pictypeid;
    }

    public String getPictypename() {
        return pictypename;
    }

    public void setPictypename(String pictypename) {
        this.pictypename = pictypename == null ? null : pictypename.trim();
    }

    public Integer getPicedition() {
        return picedition;
    }

    public void setPicedition(Integer picedition) {
        this.picedition = picedition;
    }

    public String getPicpath() {
        return picpath;
    }

    public void setPicpath(String picpath) {
        this.picpath = picpath == null ? null : picpath.trim();
    }

    public String getPicurlpath() {
        return picurlpath;
    }

    public void setPicurlpath(String picurlpath) {
        this.picurlpath = picurlpath == null ? null : picurlpath.trim();
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

    public Integer getShowflag() {
        return showflag;
    }

    public void setShowflag(Integer showflag) {
        this.showflag = showflag;
    }

    public Integer getShoworder() {
        return showorder;
    }

    public void setShoworder(Integer showorder) {
        this.showorder = showorder;
    }
}