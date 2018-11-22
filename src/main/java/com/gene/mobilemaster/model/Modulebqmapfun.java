package com.gene.mobilemaster.model;

public class Modulebqmapfun {
    private Integer flowno;

    private String bqlb;

    private String ywlx;

    private String callfun;

    private Integer useparamcount;

    private Integer totalparamcount;

    public Integer getFlowno() {
        return flowno;
    }

    public void setFlowno(Integer flowno) {
        this.flowno = flowno;
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

    public String getCallfun() {
        return callfun;
    }

    public void setCallfun(String callfun) {
        this.callfun = callfun == null ? null : callfun.trim();
    }

    public Integer getUseparamcount() {
        return useparamcount;
    }

    public void setUseparamcount(Integer useparamcount) {
        this.useparamcount = useparamcount;
    }

    public Integer getTotalparamcount() {
        return totalparamcount;
    }

    public void setTotalparamcount(Integer totalparamcount) {
        this.totalparamcount = totalparamcount;
    }
}