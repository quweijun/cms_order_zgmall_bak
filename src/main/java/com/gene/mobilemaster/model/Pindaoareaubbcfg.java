package com.gene.mobilemaster.model;

import java.util.Date;

public class Pindaoareaubbcfg {
    private Integer pdjb;

    private Integer pdid;

    private Integer flowno;

    private String ubbareaname;

    private String addor;

    private Date addtime;

    private String uptor;

    private Date upttime;

    private Integer xh;

    private Integer enableflag;

    private String ubbcontent;

    public Integer getPdjb() {
        return pdjb;
    }

    public void setPdjb(Integer pdjb) {
        this.pdjb = pdjb;
    }

    public Integer getPdid() {
        return pdid;
    }

    public void setPdid(Integer pdid) {
        this.pdid = pdid;
    }

    public Integer getFlowno() {
        return flowno;
    }

    public void setFlowno(Integer flowno) {
        this.flowno = flowno;
    }

    public String getUbbareaname() {
        return ubbareaname;
    }

    public void setUbbareaname(String ubbareaname) {
        this.ubbareaname = ubbareaname == null ? null : ubbareaname.trim();
    }

    public String getAddor() {
        return addor;
    }

    public void setAddor(String addor) {
        this.addor = addor == null ? null : addor.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getUptor() {
        return uptor;
    }

    public void setUptor(String uptor) {
        this.uptor = uptor == null ? null : uptor.trim();
    }

    public Date getUpttime() {
        return upttime;
    }

    public void setUpttime(Date upttime) {
        this.upttime = upttime;
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public Integer getEnableflag() {
        return enableflag;
    }

    public void setEnableflag(Integer enableflag) {
        this.enableflag = enableflag;
    }

    public String getUbbcontent() {
        return ubbcontent;
    }

    public void setUbbcontent(String ubbcontent) {
        this.ubbcontent = ubbcontent == null ? null : ubbcontent.trim();
    }
}