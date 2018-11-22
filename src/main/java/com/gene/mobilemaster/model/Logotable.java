package com.gene.mobilemaster.model;

import java.util.Date;

public class Logotable {
    private Integer lid;

    private Integer logotype;

    private String logopict;

    private String logourl;

    private String webpict;

    private Date addtime;

    private String addor;

    private Integer flag;

    private Integer showloc;

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public Integer getLogotype() {
        return logotype;
    }

    public void setLogotype(Integer logotype) {
        this.logotype = logotype;
    }

    public String getLogopict() {
        return logopict;
    }

    public void setLogopict(String logopict) {
        this.logopict = logopict == null ? null : logopict.trim();
    }

    public String getLogourl() {
        return logourl;
    }

    public void setLogourl(String logourl) {
        this.logourl = logourl == null ? null : logourl.trim();
    }

    public String getWebpict() {
        return webpict;
    }

    public void setWebpict(String webpict) {
        this.webpict = webpict == null ? null : webpict.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getAddor() {
        return addor;
    }

    public void setAddor(String addor) {
        this.addor = addor == null ? null : addor.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getShowloc() {
        return showloc;
    }

    public void setShowloc(Integer showloc) {
        this.showloc = showloc;
    }
}