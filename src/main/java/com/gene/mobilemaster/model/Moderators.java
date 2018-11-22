package com.gene.mobilemaster.model;

import java.util.Date;

public class Moderators {
    private Long moderatorsId;

    private Integer zddh;

    private Integer mddh;

    private String title;

    private String theme;

    private String content;

    private String customerid;

    private String province;

    private String city;

    private Integer hits;

    private Date addtime;

    private Integer xh;

    private Integer isgood;

    private Integer islock;

    private Integer isdigest;

    public Long getModeratorsId() {
        return moderatorsId;
    }

    public void setModeratorsId(Long moderatorsId) {
        this.moderatorsId = moderatorsId;
    }

    public Integer getZddh() {
        return zddh;
    }

    public void setZddh(Integer zddh) {
        this.zddh = zddh;
    }

    public Integer getMddh() {
        return mddh;
    }

    public void setMddh(Integer mddh) {
        this.mddh = mddh;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme == null ? null : theme.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public Integer getIsgood() {
        return isgood;
    }

    public void setIsgood(Integer isgood) {
        this.isgood = isgood;
    }

    public Integer getIslock() {
        return islock;
    }

    public void setIslock(Integer islock) {
        this.islock = islock;
    }

    public Integer getIsdigest() {
        return isdigest;
    }

    public void setIsdigest(Integer isdigest) {
        this.isdigest = isdigest;
    }
}