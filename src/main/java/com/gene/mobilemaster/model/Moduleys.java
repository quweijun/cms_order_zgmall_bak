package com.gene.mobilemaster.model;

public class Moduleys {
    private Integer pgid;

    private Integer ysid;

    private Integer ysxh;

    private String bqlb;

    private String ywlx;

    private String quickcfgstr;

    public Integer getPgid() {
        return pgid;
    }

    public void setPgid(Integer pgid) {
        this.pgid = pgid;
    }

    public Integer getYsid() {
        return ysid;
    }

    public void setYsid(Integer ysid) {
        this.ysid = ysid;
    }

    public Integer getYsxh() {
        return ysxh;
    }

    public void setYsxh(Integer ysxh) {
        this.ysxh = ysxh;
    }

    public String getBqlb() {
        return bqlb;
    }

    public void setBqlb(String bqlb) {
        this.bqlb = bqlb == null ? null : bqlb.trim();
    }

    public String getYwlx() {
        return ywlx;
    }

    public void setYwlx(String ywlx) {
        this.ywlx = ywlx == null ? null : ywlx.trim();
    }

    public String getQuickcfgstr() {
        return quickcfgstr;
    }

    public void setQuickcfgstr(String quickcfgstr) {
        this.quickcfgstr = quickcfgstr == null ? null : quickcfgstr.trim();
    }
}