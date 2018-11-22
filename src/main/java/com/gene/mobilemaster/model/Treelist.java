package com.gene.mobilemaster.model;

public class Treelist {
    private Integer treeid;

    private String treename;

    private String treebz;

    private Integer xh;

    private Integer ftreeid;

    private String url;

    private Integer isplay;

    private Integer opentype;

    private Integer systemid;

    public Integer getTreeid() {
        return treeid;
    }

    public void setTreeid(Integer treeid) {
        this.treeid = treeid;
    }

    public String getTreename() {
        return treename;
    }

    public void setTreename(String treename) {
        this.treename = treename == null ? null : treename.trim();
    }

    public String getTreebz() {
        return treebz;
    }

    public void setTreebz(String treebz) {
        this.treebz = treebz == null ? null : treebz.trim();
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public Integer getFtreeid() {
        return ftreeid;
    }

    public void setFtreeid(Integer ftreeid) {
        this.ftreeid = ftreeid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getIsplay() {
        return isplay;
    }

    public void setIsplay(Integer isplay) {
        this.isplay = isplay;
    }

    public Integer getOpentype() {
        return opentype;
    }

    public void setOpentype(Integer opentype) {
        this.opentype = opentype;
    }

    public Integer getSystemid() {
        return systemid;
    }

    public void setSystemid(Integer systemid) {
        this.systemid = systemid;
    }
}