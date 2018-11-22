package com.gene.mobilemaster.model;

public class Urllist {
    private String url;

    private Integer pvcount;

    private Integer flag;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getPvcount() {
        return pvcount;
    }

    public void setPvcount(Integer pvcount) {
        this.pvcount = pvcount;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}