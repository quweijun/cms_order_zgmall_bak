package com.gene.mobilemaster.model;

import java.util.Date;

public class Siteinfo {
    private Integer siteid;

    private Integer custid;

    private Integer sitetype;

    private String sitename;

    private String siteurl;

    private Integer contenttype;

    private String siteresume;

    private Integer sitestatus;

    private String sitelogurl;

    private String subdomain;

    private Integer jumptype;

    private String jumppindao;

    private String jumpurl;

    private Date addtime;

    public Integer getSiteid() {
        return siteid;
    }

    public void setSiteid(Integer siteid) {
        this.siteid = siteid;
    }

    public Integer getCustid() {
        return custid;
    }

    public void setCustid(Integer custid) {
        this.custid = custid;
    }

    public Integer getSitetype() {
        return sitetype;
    }

    public void setSitetype(Integer sitetype) {
        this.sitetype = sitetype;
    }

    public String getSitename() {
        return sitename;
    }

    public void setSitename(String sitename) {
        this.sitename = sitename == null ? null : sitename.trim();
    }

    public String getSiteurl() {
        return siteurl;
    }

    public void setSiteurl(String siteurl) {
        this.siteurl = siteurl == null ? null : siteurl.trim();
    }

    public Integer getContenttype() {
        return contenttype;
    }

    public void setContenttype(Integer contenttype) {
        this.contenttype = contenttype;
    }

    public String getSiteresume() {
        return siteresume;
    }

    public void setSiteresume(String siteresume) {
        this.siteresume = siteresume == null ? null : siteresume.trim();
    }

    public Integer getSitestatus() {
        return sitestatus;
    }

    public void setSitestatus(Integer sitestatus) {
        this.sitestatus = sitestatus;
    }

    public String getSitelogurl() {
        return sitelogurl;
    }

    public void setSitelogurl(String sitelogurl) {
        this.sitelogurl = sitelogurl == null ? null : sitelogurl.trim();
    }

    public String getSubdomain() {
        return subdomain;
    }

    public void setSubdomain(String subdomain) {
        this.subdomain = subdomain == null ? null : subdomain.trim();
    }

    public Integer getJumptype() {
        return jumptype;
    }

    public void setJumptype(Integer jumptype) {
        this.jumptype = jumptype;
    }

    public String getJumppindao() {
        return jumppindao;
    }

    public void setJumppindao(String jumppindao) {
        this.jumppindao = jumppindao == null ? null : jumppindao.trim();
    }

    public String getJumpurl() {
        return jumpurl;
    }

    public void setJumpurl(String jumpurl) {
        this.jumpurl = jumpurl == null ? null : jumpurl.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}