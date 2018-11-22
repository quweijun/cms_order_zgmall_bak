package com.gene.mobilemaster.model;

import java.util.Date;

public class News {
    private Integer newsid;

    private Integer type;

    private String title;

    private String issuer;

    private Date addtime;

    private Integer flag;

    private Integer times;

    private Integer displaytype;

    private String newskey;

    private Integer smalltype;

    private Integer topflag;

    private Integer hits;

    private String lastuptuser;

    private Date lastupttime;

    public Integer getNewsid() {
        return newsid;
    }

    public void setNewsid(Integer newsid) {
        this.newsid = newsid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer == null ? null : issuer.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public Integer getDisplaytype() {
        return displaytype;
    }

    public void setDisplaytype(Integer displaytype) {
        this.displaytype = displaytype;
    }

    public String getNewskey() {
        return newskey;
    }

    public void setNewskey(String newskey) {
        this.newskey = newskey == null ? null : newskey.trim();
    }

    public Integer getSmalltype() {
        return smalltype;
    }

    public void setSmalltype(Integer smalltype) {
        this.smalltype = smalltype;
    }

    public Integer getTopflag() {
        return topflag;
    }

    public void setTopflag(Integer topflag) {
        this.topflag = topflag;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public String getLastuptuser() {
        return lastuptuser;
    }

    public void setLastuptuser(String lastuptuser) {
        this.lastuptuser = lastuptuser == null ? null : lastuptuser.trim();
    }

    public Date getLastupttime() {
        return lastupttime;
    }

    public void setLastupttime(Date lastupttime) {
        this.lastupttime = lastupttime;
    }
}