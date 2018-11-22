package com.gene.mobilemaster.model;

import java.util.Date;

public class Android_notice {
    private Long noticeid;

    private String noticetype;

    private String noticeObjectid;

    private Date addtime;

    public Long getNoticeid() {
        return noticeid;
    }

    public void setNoticeid(Long noticeid) {
        this.noticeid = noticeid;
    }

    public String getNoticetype() {
        return noticetype;
    }

    public void setNoticetype(String noticetype) {
        this.noticetype = noticetype == null ? null : noticetype.trim();
    }

    public String getNoticeObjectid() {
        return noticeObjectid;
    }

    public void setNoticeObjectid(String noticeObjectid) {
        this.noticeObjectid = noticeObjectid == null ? null : noticeObjectid.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}