package com.gene.mobilemaster.model;

import java.util.Date;

public class Sessionmessage {
    private String sessionid;

    private Date addtime;

    private String content;

    private Integer mapmsgid;

    private Integer mapforumid;

    private Integer mapforumreplyid;

    private Integer clearflag;

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid == null ? null : sessionid.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getMapmsgid() {
        return mapmsgid;
    }

    public void setMapmsgid(Integer mapmsgid) {
        this.mapmsgid = mapmsgid;
    }

    public Integer getMapforumid() {
        return mapforumid;
    }

    public void setMapforumid(Integer mapforumid) {
        this.mapforumid = mapforumid;
    }

    public Integer getMapforumreplyid() {
        return mapforumreplyid;
    }

    public void setMapforumreplyid(Integer mapforumreplyid) {
        this.mapforumreplyid = mapforumreplyid;
    }

    public Integer getClearflag() {
        return clearflag;
    }

    public void setClearflag(Integer clearflag) {
        this.clearflag = clearflag;
    }
}