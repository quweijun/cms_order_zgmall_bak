package com.gene.mobilemaster.model;

import java.util.Date;

public class Colordict {
    private Integer colorid;

    private String colorname;

    private String colorpyjc;

    private Date addtime;

    private String adduser;

    private String enableflag;

    public Integer getColorid() {
        return colorid;
    }

    public void setColorid(Integer colorid) {
        this.colorid = colorid;
    }

    public String getColorname() {
        return colorname;
    }

    public void setColorname(String colorname) {
        this.colorname = colorname == null ? null : colorname.trim();
    }

    public String getColorpyjc() {
        return colorpyjc;
    }

    public void setColorpyjc(String colorpyjc) {
        this.colorpyjc = colorpyjc == null ? null : colorpyjc.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getAdduser() {
        return adduser;
    }

    public void setAdduser(String adduser) {
        this.adduser = adduser == null ? null : adduser.trim();
    }

    public String getEnableflag() {
        return enableflag;
    }

    public void setEnableflag(String enableflag) {
        this.enableflag = enableflag == null ? null : enableflag.trim();
    }
}