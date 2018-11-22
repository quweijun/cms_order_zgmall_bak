package com.gene.mobilemaster.model;

import java.util.Date;

public class Jd_productfl_zg_map {
    private Integer flowno;

    private String flbh;

    private String lb1;

    private String lb2;

    private String lb3;

    private Integer zgflc1;

    private Integer zgflc2;

    private Integer zgflc3;

    private Integer enableflag;

    private String jdlistpageurl;

    private Integer listpagecount;

    private Integer listpagesize;

    private Integer hasnewprod;

    private Date createdate;

    private Date lastmidifydate;

    public Integer getFlowno() {
        return flowno;
    }

    public void setFlowno(Integer flowno) {
        this.flowno = flowno;
    }

    public String getFlbh() {
        return flbh;
    }

    public void setFlbh(String flbh) {
        this.flbh = flbh == null ? null : flbh.trim();
    }

    public String getLb1() {
        return lb1;
    }

    public void setLb1(String lb1) {
        this.lb1 = lb1 == null ? null : lb1.trim();
    }

    public String getLb2() {
        return lb2;
    }

    public void setLb2(String lb2) {
        this.lb2 = lb2 == null ? null : lb2.trim();
    }

    public String getLb3() {
        return lb3;
    }

    public void setLb3(String lb3) {
        this.lb3 = lb3 == null ? null : lb3.trim();
    }

    public Integer getZgflc1() {
        return zgflc1;
    }

    public void setZgflc1(Integer zgflc1) {
        this.zgflc1 = zgflc1;
    }

    public Integer getZgflc2() {
        return zgflc2;
    }

    public void setZgflc2(Integer zgflc2) {
        this.zgflc2 = zgflc2;
    }

    public Integer getZgflc3() {
        return zgflc3;
    }

    public void setZgflc3(Integer zgflc3) {
        this.zgflc3 = zgflc3;
    }

    public Integer getEnableflag() {
        return enableflag;
    }

    public void setEnableflag(Integer enableflag) {
        this.enableflag = enableflag;
    }

    public String getJdlistpageurl() {
        return jdlistpageurl;
    }

    public void setJdlistpageurl(String jdlistpageurl) {
        this.jdlistpageurl = jdlistpageurl == null ? null : jdlistpageurl.trim();
    }

    public Integer getListpagecount() {
        return listpagecount;
    }

    public void setListpagecount(Integer listpagecount) {
        this.listpagecount = listpagecount;
    }

    public Integer getListpagesize() {
        return listpagesize;
    }

    public void setListpagesize(Integer listpagesize) {
        this.listpagesize = listpagesize;
    }

    public Integer getHasnewprod() {
        return hasnewprod;
    }

    public void setHasnewprod(Integer hasnewprod) {
        this.hasnewprod = hasnewprod;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getLastmidifydate() {
        return lastmidifydate;
    }

    public void setLastmidifydate(Date lastmidifydate) {
        this.lastmidifydate = lastmidifydate;
    }
}