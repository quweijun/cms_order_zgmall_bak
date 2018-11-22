package com.gene.mobilemaster.model;

import java.util.Date;

public class Zhuanquzd {
    private Integer zqid;

    private String zqname;

    private Integer enableflag;

    private String bzdesc;

    private String addor;

    private Date addtime;

    private String uptor;

    private Date upttime;

    private Integer xh;

    private String divcss1;

    private String divcss2;

    private Integer ispublic;

    private String attachcssscript;

    public Integer getZqid() {
        return zqid;
    }

    public void setZqid(Integer zqid) {
        this.zqid = zqid;
    }

    public String getZqname() {
        return zqname;
    }

    public void setZqname(String zqname) {
        this.zqname = zqname == null ? null : zqname.trim();
    }

    public Integer getEnableflag() {
        return enableflag;
    }

    public void setEnableflag(Integer enableflag) {
        this.enableflag = enableflag;
    }

    public String getBzdesc() {
        return bzdesc;
    }

    public void setBzdesc(String bzdesc) {
        this.bzdesc = bzdesc == null ? null : bzdesc.trim();
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

    public String getDivcss1() {
        return divcss1;
    }

    public void setDivcss1(String divcss1) {
        this.divcss1 = divcss1 == null ? null : divcss1.trim();
    }

    public String getDivcss2() {
        return divcss2;
    }

    public void setDivcss2(String divcss2) {
        this.divcss2 = divcss2 == null ? null : divcss2.trim();
    }

    public Integer getIspublic() {
        return ispublic;
    }

    public void setIspublic(Integer ispublic) {
        this.ispublic = ispublic;
    }

    public String getAttachcssscript() {
        return attachcssscript;
    }

    public void setAttachcssscript(String attachcssscript) {
        this.attachcssscript = attachcssscript == null ? null : attachcssscript.trim();
    }
}