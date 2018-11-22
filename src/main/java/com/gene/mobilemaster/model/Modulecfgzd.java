package com.gene.mobilemaster.model;

public class Modulecfgzd {
    private String zddh;

    private String mddh;

    private String enzddh;

    private String zwmc;

    private String bzsm;

    private String bzsm2;

    private Integer xh;

    private String enableflag;

    public String getZddh() {
        return zddh;
    }

    public void setZddh(String zddh) {
        this.zddh = zddh == null ? null : zddh.trim();
    }

    public String getMddh() {
        return mddh;
    }

    public void setMddh(String mddh) {
        this.mddh = mddh == null ? null : mddh.trim();
    }

    public String getEnzddh() {
        return enzddh;
    }

    public void setEnzddh(String enzddh) {
        this.enzddh = enzddh == null ? null : enzddh.trim();
    }

    public String getZwmc() {
        return zwmc;
    }

    public void setZwmc(String zwmc) {
        this.zwmc = zwmc == null ? null : zwmc.trim();
    }

    public String getBzsm() {
        return bzsm;
    }

    public void setBzsm(String bzsm) {
        this.bzsm = bzsm == null ? null : bzsm.trim();
    }

    public String getBzsm2() {
        return bzsm2;
    }

    public void setBzsm2(String bzsm2) {
        this.bzsm2 = bzsm2 == null ? null : bzsm2.trim();
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public String getEnableflag() {
        return enableflag;
    }

    public void setEnableflag(String enableflag) {
        this.enableflag = enableflag == null ? null : enableflag.trim();
    }
}