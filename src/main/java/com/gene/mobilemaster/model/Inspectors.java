package com.gene.mobilemaster.model;

import java.util.Date;

public class Inspectors {
    private Integer id;

    private String zname;

    private String ename;

    private Date addtime;

    private String addtor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZname() {
        return zname;
    }

    public void setZname(String zname) {
        this.zname = zname == null ? null : zname.trim();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getAddtor() {
        return addtor;
    }

    public void setAddtor(String addtor) {
        this.addtor = addtor == null ? null : addtor.trim();
    }
}