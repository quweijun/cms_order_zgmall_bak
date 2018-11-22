package com.gene.mobilemaster.model;

import java.util.Date;

public class Faqmodule {
    private Integer moduleid;

    private String modulename;

    private String moduletitle;

    private Integer sort;

    private String adduser;

    private Date addtime;

    private Integer flag;

    public Integer getModuleid() {
        return moduleid;
    }

    public void setModuleid(Integer moduleid) {
        this.moduleid = moduleid;
    }

    public String getModulename() {
        return modulename;
    }

    public void setModulename(String modulename) {
        this.modulename = modulename == null ? null : modulename.trim();
    }

    public String getModuletitle() {
        return moduletitle;
    }

    public void setModuletitle(String moduletitle) {
        this.moduletitle = moduletitle == null ? null : moduletitle.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}