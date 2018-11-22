package com.gene.mobilemaster.model;

import java.util.Date;

public class Gotopgidlog {
    private String pgid;

    private String gotopgid;

    private Date gototime;

    public String getPgid() {
        return pgid;
    }

    public void setPgid(String pgid) {
        this.pgid = pgid == null ? null : pgid.trim();
    }

    public String getGotopgid() {
        return gotopgid;
    }

    public void setGotopgid(String gotopgid) {
        this.gotopgid = gotopgid == null ? null : gotopgid.trim();
    }

    public Date getGototime() {
        return gototime;
    }

    public void setGototime(Date gototime) {
        this.gototime = gototime;
    }
}