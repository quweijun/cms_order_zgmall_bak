package com.gene.mobilemaster.model;

public class Pindaoads {
    private String pdjb;

    private Integer pdid;

    private String pdmc;

    private Integer xh;

    private Integer enableflag;

    public String getPdjb() {
        return pdjb;
    }

    public void setPdjb(String pdjb) {
        this.pdjb = pdjb == null ? null : pdjb.trim();
    }

    public Integer getPdid() {
        return pdid;
    }

    public void setPdid(Integer pdid) {
        this.pdid = pdid;
    }

    public String getPdmc() {
        return pdmc;
    }

    public void setPdmc(String pdmc) {
        this.pdmc = pdmc == null ? null : pdmc.trim();
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public Integer getEnableflag() {
        return enableflag;
    }

    public void setEnableflag(Integer enableflag) {
        this.enableflag = enableflag;
    }
}