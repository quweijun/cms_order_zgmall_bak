package com.gene.mobilemaster.model;

import java.util.Date;

public class Userguessolympiclog {
    private String userid;

    private Date guessdate;

    private Date submitdate;

    private Integer guessgoldmedals;

    private Integer guessmedals;

    private String mobile;

    private Integer flowno;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Date getGuessdate() {
        return guessdate;
    }

    public void setGuessdate(Date guessdate) {
        this.guessdate = guessdate;
    }

    public Date getSubmitdate() {
        return submitdate;
    }

    public void setSubmitdate(Date submitdate) {
        this.submitdate = submitdate;
    }

    public Integer getGuessgoldmedals() {
        return guessgoldmedals;
    }

    public void setGuessgoldmedals(Integer guessgoldmedals) {
        this.guessgoldmedals = guessgoldmedals;
    }

    public Integer getGuessmedals() {
        return guessmedals;
    }

    public void setGuessmedals(Integer guessmedals) {
        this.guessmedals = guessmedals;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getFlowno() {
        return flowno;
    }

    public void setFlowno(Integer flowno) {
        this.flowno = flowno;
    }
}