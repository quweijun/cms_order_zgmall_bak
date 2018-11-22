package com.gene.mobilemaster.model;

import java.util.Date;

public class Mobile_qh_sc {
    private String mobile;

    private Date accesstime;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Date getAccesstime() {
        return accesstime;
    }

    public void setAccesstime(Date accesstime) {
        this.accesstime = accesstime;
    }
}