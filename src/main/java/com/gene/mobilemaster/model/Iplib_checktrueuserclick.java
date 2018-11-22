package com.gene.mobilemaster.model;

public class Iplib_checktrueuserclick {
    private Integer flowno;

    private String checkip;

    private Integer checktype;

    private Integer enableflag;

    public Integer getFlowno() {
        return flowno;
    }

    public void setFlowno(Integer flowno) {
        this.flowno = flowno;
    }

    public String getCheckip() {
        return checkip;
    }

    public void setCheckip(String checkip) {
        this.checkip = checkip == null ? null : checkip.trim();
    }

    public Integer getChecktype() {
        return checktype;
    }

    public void setChecktype(Integer checktype) {
        this.checktype = checktype;
    }

    public Integer getEnableflag() {
        return enableflag;
    }

    public void setEnableflag(Integer enableflag) {
        this.enableflag = enableflag;
    }
}