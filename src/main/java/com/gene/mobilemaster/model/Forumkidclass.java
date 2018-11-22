package com.gene.mobilemaster.model;

import java.util.Date;

public class Forumkidclass {
    private Integer classid;

    private Integer parentid;

    private String classname;

    private String creater;

    private Date adddate;

    private Byte islock;

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public Date getAdddate() {
        return adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }

    public Byte getIslock() {
        return islock;
    }

    public void setIslock(Byte islock) {
        this.islock = islock;
    }
}