package com.gene.mobilemaster.model;

import java.util.Date;

public class Mobileinterfacemonitor {
    private Integer flowno;

    private String useragent;

    private String catchmobileurl;

    private Date accesstime;

    public Integer getFlowno() {
        return flowno;
    }

    public void setFlowno(Integer flowno) {
        this.flowno = flowno;
    }

    public String getUseragent() {
        return useragent;
    }

    public void setUseragent(String useragent) {
        this.useragent = useragent == null ? null : useragent.trim();
    }

    public String getCatchmobileurl() {
        return catchmobileurl;
    }

    public void setCatchmobileurl(String catchmobileurl) {
        this.catchmobileurl = catchmobileurl == null ? null : catchmobileurl.trim();
    }

    public Date getAccesstime() {
        return accesstime;
    }

    public void setAccesstime(Date accesstime) {
        this.accesstime = accesstime;
    }
}