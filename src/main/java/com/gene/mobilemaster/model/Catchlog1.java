package com.gene.mobilemaster.model;

import java.util.Date;

public class Catchlog1 {
    private Date accesstime;

    private String ip;

    private String pstr;

    public Date getAccesstime() {
        return accesstime;
    }

    public void setAccesstime(Date accesstime) {
        this.accesstime = accesstime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getPstr() {
        return pstr;
    }

    public void setPstr(String pstr) {
        this.pstr = pstr == null ? null : pstr.trim();
    }
}