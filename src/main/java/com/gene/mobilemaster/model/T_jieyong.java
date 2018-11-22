package com.gene.mobilemaster.model;

import java.util.Date;

public class T_jieyong {
    private Integer id;

    private String mJycp;

    private String mCptm;

    private String mJyyt;

    private Date mJysj;

    private Date mGhsj;

    private String mJyr;

    private String mBz;

    private Date mAddtime;

    private String mCzr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getmJycp() {
        return mJycp;
    }

    public void setmJycp(String mJycp) {
        this.mJycp = mJycp == null ? null : mJycp.trim();
    }

    public String getmCptm() {
        return mCptm;
    }

    public void setmCptm(String mCptm) {
        this.mCptm = mCptm == null ? null : mCptm.trim();
    }

    public String getmJyyt() {
        return mJyyt;
    }

    public void setmJyyt(String mJyyt) {
        this.mJyyt = mJyyt == null ? null : mJyyt.trim();
    }

    public Date getmJysj() {
        return mJysj;
    }

    public void setmJysj(Date mJysj) {
        this.mJysj = mJysj;
    }

    public Date getmGhsj() {
        return mGhsj;
    }

    public void setmGhsj(Date mGhsj) {
        this.mGhsj = mGhsj;
    }

    public String getmJyr() {
        return mJyr;
    }

    public void setmJyr(String mJyr) {
        this.mJyr = mJyr == null ? null : mJyr.trim();
    }

    public String getmBz() {
        return mBz;
    }

    public void setmBz(String mBz) {
        this.mBz = mBz == null ? null : mBz.trim();
    }

    public Date getmAddtime() {
        return mAddtime;
    }

    public void setmAddtime(Date mAddtime) {
        this.mAddtime = mAddtime;
    }

    public String getmCzr() {
        return mCzr;
    }

    public void setmCzr(String mCzr) {
        this.mCzr = mCzr == null ? null : mCzr.trim();
    }
}