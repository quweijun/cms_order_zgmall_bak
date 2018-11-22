package com.gene.mobilemaster.model;

import java.util.Date;

public class Fan_out {
    private Long fanid;

    private String mobile;

    private Date sendtime;

    public Long getFanid() {
        return fanid;
    }

    public void setFanid(Long fanid) {
        this.fanid = fanid;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }
}