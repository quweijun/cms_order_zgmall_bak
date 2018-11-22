package com.gene.mobilemaster.model;

import java.util.Date;

public class Tmpiplib {
    private Integer flowno;

    private String ip;

    private String sheng;

    private String city;

    private Integer shengid;

    private String source;

    private String enableflag;

    private Date initdate;

    private Integer initcount;

    private Integer repeatnum;

    private String bzdesc;

    private Date analydate;

    public Integer getFlowno() {
        return flowno;
    }

    public void setFlowno(Integer flowno) {
        this.flowno = flowno;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getSheng() {
        return sheng;
    }

    public void setSheng(String sheng) {
        this.sheng = sheng == null ? null : sheng.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Integer getShengid() {
        return shengid;
    }

    public void setShengid(Integer shengid) {
        this.shengid = shengid;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getEnableflag() {
        return enableflag;
    }

    public void setEnableflag(String enableflag) {
        this.enableflag = enableflag == null ? null : enableflag.trim();
    }

    public Date getInitdate() {
        return initdate;
    }

    public void setInitdate(Date initdate) {
        this.initdate = initdate;
    }

    public Integer getInitcount() {
        return initcount;
    }

    public void setInitcount(Integer initcount) {
        this.initcount = initcount;
    }

    public Integer getRepeatnum() {
        return repeatnum;
    }

    public void setRepeatnum(Integer repeatnum) {
        this.repeatnum = repeatnum;
    }

    public String getBzdesc() {
        return bzdesc;
    }

    public void setBzdesc(String bzdesc) {
        this.bzdesc = bzdesc == null ? null : bzdesc.trim();
    }

    public Date getAnalydate() {
        return analydate;
    }

    public void setAnalydate(Date analydate) {
        this.analydate = analydate;
    }
}