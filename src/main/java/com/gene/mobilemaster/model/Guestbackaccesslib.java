package com.gene.mobilemaster.model;

import java.util.Date;

public class Guestbackaccesslib {
    private Long guestid;

    private String loginid;

    private String loginname;

    private Integer accesstimes;

    private Date createdate;

    private Date lastaccessdate;

    public Long getGuestid() {
        return guestid;
    }

    public void setGuestid(Long guestid) {
        this.guestid = guestid;
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid == null ? null : loginid.trim();
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public Integer getAccesstimes() {
        return accesstimes;
    }

    public void setAccesstimes(Integer accesstimes) {
        this.accesstimes = accesstimes;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getLastaccessdate() {
        return lastaccessdate;
    }

    public void setLastaccessdate(Date lastaccessdate) {
        this.lastaccessdate = lastaccessdate;
    }
}