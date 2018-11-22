package com.gene.mobilemaster.model;

import java.util.Date;

public class Communitys {
    private Long communityId;

    private Integer zddh;

    private Integer mddh;

    private Integer moderatorsId;

    private Integer customerid;

    private String nickname;

    private String title;

    private String img;

    private String content;

    private Integer hits;

    private Integer islock;

    private Integer isgood;

    private Integer isdigest;

    private Integer isstrong;

    private Integer isread;

    private String ip;

    private Date addtime;

    private Date adddate;

    public Long getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Long communityId) {
        this.communityId = communityId;
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

    public Integer getModeratorsId() {
        return moderatorsId;
    }

    public void setModeratorsId(Integer moderatorsId) {
        this.moderatorsId = moderatorsId;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public Integer getIslock() {
        return islock;
    }

    public void setIslock(Integer islock) {
        this.islock = islock;
    }

    public Integer getIsgood() {
        return isgood;
    }

    public void setIsgood(Integer isgood) {
        this.isgood = isgood;
    }

    public Integer getIsdigest() {
        return isdigest;
    }

    public void setIsdigest(Integer isdigest) {
        this.isdigest = isdigest;
    }

    public Integer getIsstrong() {
        return isstrong;
    }

    public void setIsstrong(Integer isstrong) {
        this.isstrong = isstrong;
    }

    public Integer getIsread() {
        return isread;
    }

    public void setIsread(Integer isread) {
        this.isread = isread;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Date getAdddate() {
        return adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }
}