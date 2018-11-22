package com.gene.mobilemaster.model;

public class Shengcfg {
    private Long shengid;

    private String shengname;

    private String areaid;

    private String firsthy;

    private String secondhy;

    private String ydbq;

    public Long getShengid() {
        return shengid;
    }

    public void setShengid(Long shengid) {
        this.shengid = shengid;
    }

    public String getShengname() {
        return shengname;
    }

    public void setShengname(String shengname) {
        this.shengname = shengname == null ? null : shengname.trim();
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid == null ? null : areaid.trim();
    }

    public String getFirsthy() {
        return firsthy;
    }

    public void setFirsthy(String firsthy) {
        this.firsthy = firsthy == null ? null : firsthy.trim();
    }

    public String getSecondhy() {
        return secondhy;
    }

    public void setSecondhy(String secondhy) {
        this.secondhy = secondhy == null ? null : secondhy.trim();
    }

    public String getYdbq() {
        return ydbq;
    }

    public void setYdbq(String ydbq) {
        this.ydbq = ydbq == null ? null : ydbq.trim();
    }
}