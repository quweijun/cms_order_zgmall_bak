package com.gene.mobilemaster.model;

import java.util.Date;

public class User_ordertongji {
    private Integer tId;

    private Date tRiqi;

    private Integer tShengchengNum;

    private Integer tQuerenNum;

    private Integer tOldQuerenNum;

    private Integer tQianshouNum;

    private String tUserid;

    private Date tAddtime;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public Date gettRiqi() {
        return tRiqi;
    }

    public void settRiqi(Date tRiqi) {
        this.tRiqi = tRiqi;
    }

    public Integer gettShengchengNum() {
        return tShengchengNum;
    }

    public void settShengchengNum(Integer tShengchengNum) {
        this.tShengchengNum = tShengchengNum;
    }

    public Integer gettQuerenNum() {
        return tQuerenNum;
    }

    public void settQuerenNum(Integer tQuerenNum) {
        this.tQuerenNum = tQuerenNum;
    }

    public Integer gettOldQuerenNum() {
        return tOldQuerenNum;
    }

    public void settOldQuerenNum(Integer tOldQuerenNum) {
        this.tOldQuerenNum = tOldQuerenNum;
    }

    public Integer gettQianshouNum() {
        return tQianshouNum;
    }

    public void settQianshouNum(Integer tQianshouNum) {
        this.tQianshouNum = tQianshouNum;
    }

    public String gettUserid() {
        return tUserid;
    }

    public void settUserid(String tUserid) {
        this.tUserid = tUserid == null ? null : tUserid.trim();
    }

    public Date gettAddtime() {
        return tAddtime;
    }

    public void settAddtime(Date tAddtime) {
        this.tAddtime = tAddtime;
    }
}