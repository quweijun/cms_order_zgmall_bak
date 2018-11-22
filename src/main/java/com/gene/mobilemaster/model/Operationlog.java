package com.gene.mobilemaster.model;

import java.util.Date;

public class Operationlog {
    private Integer id;

    private Integer tid;

    private Integer logid;

    private String loguser;

    private String logname;

    private Date logdatetime;

    private String logcontent;

    private String logip;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getLogid() {
        return logid;
    }

    public void setLogid(Integer logid) {
        this.logid = logid;
    }

    public String getLoguser() {
        return loguser;
    }

    public void setLoguser(String loguser) {
        this.loguser = loguser == null ? null : loguser.trim();
    }

    public String getLogname() {
        return logname;
    }

    public void setLogname(String logname) {
        this.logname = logname == null ? null : logname.trim();
    }

    public Date getLogdatetime() {
        return logdatetime;
    }

    public void setLogdatetime(Date logdatetime) {
        this.logdatetime = logdatetime;
    }

    public String getLogcontent() {
        return logcontent;
    }

    public void setLogcontent(String logcontent) {
        this.logcontent = logcontent == null ? null : logcontent.trim();
    }

    public String getLogip() {
        return logip;
    }

    public void setLogip(String logip) {
        this.logip = logip == null ? null : logip.trim();
    }
}