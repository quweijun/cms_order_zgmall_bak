package com.gene.mobilemaster.model;

import java.util.Date;

public class Orderpv {
    private Date submitdate;

    private Integer bussinessid;

    private Double bussinesscount;

    public Date getSubmitdate() {
        return submitdate;
    }

    public void setSubmitdate(Date submitdate) {
        this.submitdate = submitdate;
    }

    public Integer getBussinessid() {
        return bussinessid;
    }

    public void setBussinessid(Integer bussinessid) {
        this.bussinessid = bussinessid;
    }

    public Double getBussinesscount() {
        return bussinesscount;
    }

    public void setBussinesscount(Double bussinesscount) {
        this.bussinesscount = bussinesscount;
    }
}