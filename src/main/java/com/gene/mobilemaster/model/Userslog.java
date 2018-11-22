package com.gene.mobilemaster.model;

import java.util.Date;

public class Userslog {
    private Integer userslogid;

    private Integer usersid;

    private String usersname;

    private String theloginip;

    private Date thelogintime;

    private String operationcontent;

    private Date operatingtime;

    private String systemtype;

    public Integer getUserslogid() {
        return userslogid;
    }

    public void setUserslogid(Integer userslogid) {
        this.userslogid = userslogid;
    }

    public Integer getUsersid() {
        return usersid;
    }

    public void setUsersid(Integer usersid) {
        this.usersid = usersid;
    }

    public String getUsersname() {
        return usersname;
    }

    public void setUsersname(String usersname) {
        this.usersname = usersname == null ? null : usersname.trim();
    }

    public String getTheloginip() {
        return theloginip;
    }

    public void setTheloginip(String theloginip) {
        this.theloginip = theloginip == null ? null : theloginip.trim();
    }

    public Date getThelogintime() {
        return thelogintime;
    }

    public void setThelogintime(Date thelogintime) {
        this.thelogintime = thelogintime;
    }

    public String getOperationcontent() {
        return operationcontent;
    }

    public void setOperationcontent(String operationcontent) {
        this.operationcontent = operationcontent == null ? null : operationcontent.trim();
    }

    public Date getOperatingtime() {
        return operatingtime;
    }

    public void setOperatingtime(Date operatingtime) {
        this.operatingtime = operatingtime;
    }

    public String getSystemtype() {
        return systemtype;
    }

    public void setSystemtype(String systemtype) {
        this.systemtype = systemtype == null ? null : systemtype.trim();
    }
}