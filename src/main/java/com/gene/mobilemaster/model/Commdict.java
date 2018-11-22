package com.gene.mobilemaster.model;

public class Commdict {
    private Long flowid;

    private Integer zddh;

    private Integer mddh;

    private String name;

    private String bzdesc;

    private Integer xh;

    private Integer flag;

    public Long getFlowid() {
        return flowid;
    }

    public void setFlowid(Long flowid) {
        this.flowid = flowid;
    }

    public Integer getZddh() {
        return zddh;
    }

    public void setZddh(Integer zddh) {
        this.zddh = zddh;
    }

    public Integer getMddh() {
        return mddh;
    }

    public void setMddh(Integer mddh) {
        this.mddh = mddh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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