package com.gene.mobilemaster.model;

import java.util.Date;

public class Redp_userlist {
    private String mobile;

    private Integer isused;

    private Integer redp;

    private Date usedtime;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getIsused() {
        return isused;
    }

    public void setIsused(Integer isused) {
        this.isused = isused;
    }

    public Integer getRedp() {
        return redp;
    }

    public void setRedp(Integer redp) {
        this.redp = redp;
    }

    public Date getUsedtime() {
        return usedtime;
    }

    public void setUsedtime(Date usedtime) {
        this.usedtime = usedtime;
    }
}