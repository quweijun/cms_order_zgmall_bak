package com.gene.mobilemaster.model;

import java.util.Date;

public class Batchsendredpackage {
    private Long flowno;

    private Integer batchno;

    private String mobile;

    private Integer sendredpackage;

    private Integer getstatus;

    private Date initdate;

    private Date getreddate;

    private Integer enableflag;

    public Long getFlowno() {
        return flowno;
    }

    public void setFlowno(Long flowno) {
        this.flowno = flowno;
    }

    public Integer getBatchno() {
        return batchno;
    }

    public void setBatchno(Integer batchno) {
        this.batchno = batchno;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getSendredpackage() {
        return sendredpackage;
    }

    public void setSendredpackage(Integer sendredpackage) {
        this.sendredpackage = sendredpackage;
    }

    public Integer getGetstatus() {
        return getstatus;
    }

    public void setGetstatus(Integer getstatus) {
        this.getstatus = getstatus;
    }

    public Date getInitdate() {
        return initdate;
    }

    public void setInitdate(Date initdate) {
        this.initdate = initdate;
    }

    public Date getGetreddate() {
        return getreddate;
    }

    public void setGetreddate(Date getreddate) {
        this.getreddate = getreddate;
    }

    public Integer getEnableflag() {
        return enableflag;
    }

    public void setEnableflag(Integer enableflag) {
        this.enableflag = enableflag;
    }
}