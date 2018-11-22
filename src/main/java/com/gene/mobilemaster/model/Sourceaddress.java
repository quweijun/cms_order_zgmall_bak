package com.gene.mobilemaster.model;

import java.util.Date;

public class Sourceaddress {
    private Double flowno;

    private Integer wapspaceid;

    private String httprefer;

    private Date countdate;

    public Double getFlowno() {
        return flowno;
    }

    public void setFlowno(Double flowno) {
        this.flowno = flowno;
    }

    public Integer getWapspaceid() {
        return wapspaceid;
    }

    public void setWapspaceid(Integer wapspaceid) {
        this.wapspaceid = wapspaceid;
    }

    public String getHttprefer() {
        return httprefer;
    }

    public void setHttprefer(String httprefer) {
        this.httprefer = httprefer == null ? null : httprefer.trim();
    }

    public Date getCountdate() {
        return countdate;
    }

    public void setCountdate(Date countdate) {
        this.countdate = countdate;
    }
}