package com.gene.mobilemaster.model;

import java.util.Date;

public class Softpromotedownlog {
    private String softid;

    private Integer sncode;

    private String imei;

    private Date reporttime;

    private String reportstatus;

    public String getSoftid() {
        return softid;
    }

    public void setSoftid(String softid) {
        this.softid = softid == null ? null : softid.trim();
    }

    public Integer getSncode() {
        return sncode;
    }

    public void setSncode(Integer sncode) {
        this.sncode = sncode;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
    }

    public Date getReporttime() {
        return reporttime;
    }

    public void setReporttime(Date reporttime) {
        this.reporttime = reporttime;
    }

    public String getReportstatus() {
        return reportstatus;
    }

    public void setReportstatus(String reportstatus) {
        this.reportstatus = reportstatus == null ? null : reportstatus.trim();
    }
}