package com.gene.mobilemaster.model;

import java.util.Date;

public class Zganalyst {
    private Date accesstime;

    private String pindaoname;

    private Integer yhsum;

    private Integer pvsum;

    private Integer pindaoid;

    private String bigtype;

    public Date getAccesstime() {
        return accesstime;
    }

    public void setAccesstime(Date accesstime) {
        this.accesstime = accesstime;
    }

    public String getPindaoname() {
        return pindaoname;
    }

    public void setPindaoname(String pindaoname) {
        this.pindaoname = pindaoname == null ? null : pindaoname.trim();
    }

    public Integer getYhsum() {
        return yhsum;
    }

    public void setYhsum(Integer yhsum) {
        this.yhsum = yhsum;
    }

    public Integer getPvsum() {
        return pvsum;
    }

    public void setPvsum(Integer pvsum) {
        this.pvsum = pvsum;
    }

    public Integer getPindaoid() {
        return pindaoid;
    }

    public void setPindaoid(Integer pindaoid) {
        this.pindaoid = pindaoid;
    }

    public String getBigtype() {
        return bigtype;
    }

    public void setBigtype(String bigtype) {
        this.bigtype = bigtype == null ? null : bigtype.trim();
    }
}