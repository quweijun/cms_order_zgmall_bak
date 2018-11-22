package com.gene.mobilemaster.model;

import java.util.Date;

public class Guestzfstatis {
    private Long flowno;

    private String urlmd5name;

    private Long guestid;

    private Long custid;

    private Integer myllcs;

    private Integer zfllcs;

    private Integer allZfllcs;

    private String parenturlmd5name;

    private Date addtime;

    private String ip;

    private String ua;

    private Integer redpackflag;

    private Integer redpackje;

    private String guestname;

    private String guestmobile;

    private String guestaddr;

    private String guestly;

    public Long getFlowno() {
        return flowno;
    }

    public void setFlowno(Long flowno) {
        this.flowno = flowno;
    }

    public String getUrlmd5name() {
        return urlmd5name;
    }

    public void setUrlmd5name(String urlmd5name) {
        this.urlmd5name = urlmd5name == null ? null : urlmd5name.trim();
    }

    public Long getGuestid() {
        return guestid;
    }

    public void setGuestid(Long guestid) {
        this.guestid = guestid;
    }

    public Long getCustid() {
        return custid;
    }

    public void setCustid(Long custid) {
        this.custid = custid;
    }

    public Integer getMyllcs() {
        return myllcs;
    }

    public void setMyllcs(Integer myllcs) {
        this.myllcs = myllcs;
    }

    public Integer getZfllcs() {
        return zfllcs;
    }

    public void setZfllcs(Integer zfllcs) {
        this.zfllcs = zfllcs;
    }

    public Integer getAllZfllcs() {
        return allZfllcs;
    }

    public void setAllZfllcs(Integer allZfllcs) {
        this.allZfllcs = allZfllcs;
    }

    public String getParenturlmd5name() {
        return parenturlmd5name;
    }

    public void setParenturlmd5name(String parenturlmd5name) {
        this.parenturlmd5name = parenturlmd5name == null ? null : parenturlmd5name.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getUa() {
        return ua;
    }

    public void setUa(String ua) {
        this.ua = ua == null ? null : ua.trim();
    }

    public Integer getRedpackflag() {
        return redpackflag;
    }

    public void setRedpackflag(Integer redpackflag) {
        this.redpackflag = redpackflag;
    }

    public Integer getRedpackje() {
        return redpackje;
    }

    public void setRedpackje(Integer redpackje) {
        this.redpackje = redpackje;
    }

    public String getGuestname() {
        return guestname;
    }

    public void setGuestname(String guestname) {
        this.guestname = guestname == null ? null : guestname.trim();
    }

    public String getGuestmobile() {
        return guestmobile;
    }

    public void setGuestmobile(String guestmobile) {
        this.guestmobile = guestmobile == null ? null : guestmobile.trim();
    }

    public String getGuestaddr() {
        return guestaddr;
    }

    public void setGuestaddr(String guestaddr) {
        this.guestaddr = guestaddr == null ? null : guestaddr.trim();
    }

    public String getGuestly() {
        return guestly;
    }

    public void setGuestly(String guestly) {
        this.guestly = guestly == null ? null : guestly.trim();
    }
}