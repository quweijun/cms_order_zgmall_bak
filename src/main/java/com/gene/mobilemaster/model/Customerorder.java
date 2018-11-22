package com.gene.mobilemaster.model;

import java.util.Date;

public class Customerorder {
    private Long customerid;

    private String customername;

    private String customermobile;

    private String address;

    private Double allccurency;

    private Double giftamount;

    private Date registertime;

    private Integer logintimes;

    private Integer ljjf;

    private Integer dqjf;

    private Integer doneorder;

    private Double donemoney;

    private Integer rejectorder;

    private Integer rejectmoney;

    private Integer donescore;

    private Integer rejectscore;

    private Double theoryloginscore;

    private Double theorydqjf;

    private Double differenc;

    private Integer fen;

    private Integer chazhi;

    private Integer onescore;

    private Integer rejectscore2;

    private Integer beforelastsixdonescore;

    private Integer beforelastsixrejectscore;

    private Integer lastallyeardonescore;

    public Long getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Long customerid) {
        this.customerid = customerid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public String getCustomermobile() {
        return customermobile;
    }

    public void setCustomermobile(String customermobile) {
        this.customermobile = customermobile == null ? null : customermobile.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Double getAllccurency() {
        return allccurency;
    }

    public void setAllccurency(Double allccurency) {
        this.allccurency = allccurency;
    }

    public Double getGiftamount() {
        return giftamount;
    }

    public void setGiftamount(Double giftamount) {
        this.giftamount = giftamount;
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    public Integer getLogintimes() {
        return logintimes;
    }

    public void setLogintimes(Integer logintimes) {
        this.logintimes = logintimes;
    }

    public Integer getLjjf() {
        return ljjf;
    }

    public void setLjjf(Integer ljjf) {
        this.ljjf = ljjf;
    }

    public Integer getDqjf() {
        return dqjf;
    }

    public void setDqjf(Integer dqjf) {
        this.dqjf = dqjf;
    }

    public Integer getDoneorder() {
        return doneorder;
    }

    public void setDoneorder(Integer doneorder) {
        this.doneorder = doneorder;
    }

    public Double getDonemoney() {
        return donemoney;
    }

    public void setDonemoney(Double donemoney) {
        this.donemoney = donemoney;
    }

    public Integer getRejectorder() {
        return rejectorder;
    }

    public void setRejectorder(Integer rejectorder) {
        this.rejectorder = rejectorder;
    }

    public Integer getRejectmoney() {
        return rejectmoney;
    }

    public void setRejectmoney(Integer rejectmoney) {
        this.rejectmoney = rejectmoney;
    }

    public Integer getDonescore() {
        return donescore;
    }

    public void setDonescore(Integer donescore) {
        this.donescore = donescore;
    }

    public Integer getRejectscore() {
        return rejectscore;
    }

    public void setRejectscore(Integer rejectscore) {
        this.rejectscore = rejectscore;
    }

    public Double getTheoryloginscore() {
        return theoryloginscore;
    }

    public void setTheoryloginscore(Double theoryloginscore) {
        this.theoryloginscore = theoryloginscore;
    }

    public Double getTheorydqjf() {
        return theorydqjf;
    }

    public void setTheorydqjf(Double theorydqjf) {
        this.theorydqjf = theorydqjf;
    }

    public Double getDifferenc() {
        return differenc;
    }

    public void setDifferenc(Double differenc) {
        this.differenc = differenc;
    }

    public Integer getFen() {
        return fen;
    }

    public void setFen(Integer fen) {
        this.fen = fen;
    }

    public Integer getChazhi() {
        return chazhi;
    }

    public void setChazhi(Integer chazhi) {
        this.chazhi = chazhi;
    }

    public Integer getonescore() {
        return onescore;
    }

    public void setonescore(Integer onescore) {
        this.onescore = onescore;
    }

    public Integer getrejectscore() {
        return rejectscore;
    }

    public void setrejectscore(Integer rejectscore) {
        this.rejectscore = rejectscore;
    }

    public Integer getBeforelastsixdonescore() {
        return beforelastsixdonescore;
    }

    public void setBeforelastsixdonescore(Integer beforelastsixdonescore) {
        this.beforelastsixdonescore = beforelastsixdonescore;
    }

    public Integer getBeforelastsixrejectscore() {
        return beforelastsixrejectscore;
    }

    public void setBeforelastsixrejectscore(Integer beforelastsixrejectscore) {
        this.beforelastsixrejectscore = beforelastsixrejectscore;
    }

    public Integer getLastallyeardonescore() {
        return lastallyeardonescore;
    }

    public void setLastallyeardonescore(Integer lastallyeardonescore) {
        this.lastallyeardonescore = lastallyeardonescore;
    }
}