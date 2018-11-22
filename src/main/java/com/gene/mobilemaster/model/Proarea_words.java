package com.gene.mobilemaster.model;

import java.util.Date;

public class Proarea_words {
    private Integer wordid;

    private Integer paid;

    private Integer bigtype;

    private String title;

    private Integer subclass;

    private Integer smalltype;

    private Date addtime;

    private String url;

    private String protypes;

    private Integer flag;

    private Integer xh;

    private Integer veiwflag;

    private String pavalue;

    public Integer getWordid() {
        return wordid;
    }

    public void setWordid(Integer wordid) {
        this.wordid = wordid;
    }

    public Integer getPaid() {
        return paid;
    }

    public void setPaid(Integer paid) {
        this.paid = paid;
    }

    public Integer getBigtype() {
        return bigtype;
    }

    public void setBigtype(Integer bigtype) {
        this.bigtype = bigtype;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getSubclass() {
        return subclass;
    }

    public void setSubclass(Integer subclass) {
        this.subclass = subclass;
    }

    public Integer getSmalltype() {
        return smalltype;
    }

    public void setSmalltype(Integer smalltype) {
        this.smalltype = smalltype;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getProtypes() {
        return protypes;
    }

    public void setProtypes(String protypes) {
        this.protypes = protypes == null ? null : protypes.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public Integer getVeiwflag() {
        return veiwflag;
    }

    public void setVeiwflag(Integer veiwflag) {
        this.veiwflag = veiwflag;
    }

    public String getPavalue() {
        return pavalue;
    }

    public void setPavalue(String pavalue) {
        this.pavalue = pavalue == null ? null : pavalue.trim();
    }
}