package com.gene.mobilemaster.model;

public class Sms_class {
    private Long flowid;

    private String zddh;

    private String mddh;

    private String mddh2;

    private String mddh3;

    private String name;

    private String moban;

    private String bzdesc;

    private Integer xh;

    private Integer flag;

    public Long getFlowid() {
        return flowid;
    }

    public void setFlowid(Long flowid) {
        this.flowid = flowid;
    }

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

    public String getMddh2() {
        return mddh2;
    }

    public void setMddh2(String mddh2) {
        this.mddh2 = mddh2 == null ? null : mddh2.trim();
    }

    public String getMddh3() {
        return mddh3;
    }

    public void setMddh3(String mddh3) {
        this.mddh3 = mddh3 == null ? null : mddh3.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMoban() {
        return moban;
    }

    public void setMoban(String moban) {
        this.moban = moban == null ? null : moban.trim();
    }

    public String getBzdesc() {
        return bzdesc;
    }

    public void setBzdesc(String bzdesc) {
        this.bzdesc = bzdesc == null ? null : bzdesc.trim();
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}