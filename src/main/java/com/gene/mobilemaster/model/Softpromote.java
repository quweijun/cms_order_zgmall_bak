package com.gene.mobilemaster.model;

import java.util.Date;

public class Softpromote {
    private Long softid;

    private String upType;

    private String catalog;

    private String softName;

    private String softDesc;

    private String softImage;

    private String downUrl;

    private String version;

    private Integer isenable;

    private Date adddate;

    private String downSize;

    private String reporturl;

    private Long downloadcounts;

    private String softtype;

    private String channelid;

    public Long getSoftid() {
        return softid;
    }

    public void setSoftid(Long softid) {
        this.softid = softid;
    }

    public String getUpType() {
        return upType;
    }

    public void setUpType(String upType) {
        this.upType = upType == null ? null : upType.trim();
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog == null ? null : catalog.trim();
    }

    public String getSoftName() {
        return softName;
    }

    public void setSoftName(String softName) {
        this.softName = softName == null ? null : softName.trim();
    }

    public String getSoftDesc() {
        return softDesc;
    }

    public void setSoftDesc(String softDesc) {
        this.softDesc = softDesc == null ? null : softDesc.trim();
    }

    public String getSoftImage() {
        return softImage;
    }

    public void setSoftImage(String softImage) {
        this.softImage = softImage == null ? null : softImage.trim();
    }

    public String getDownUrl() {
        return downUrl;
    }

    public void setDownUrl(String downUrl) {
        this.downUrl = downUrl == null ? null : downUrl.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public Integer getIsenable() {
        return isenable;
    }

    public void setIsenable(Integer isenable) {
        this.isenable = isenable;
    }

    public Date getAdddate() {
        return adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }

    public String getDownSize() {
        return downSize;
    }

    public void setDownSize(String downSize) {
        this.downSize = downSize == null ? null : downSize.trim();
    }

    public String getReporturl() {
        return reporturl;
    }

    public void setReporturl(String reporturl) {
        this.reporturl = reporturl == null ? null : reporturl.trim();
    }

    public Long getDownloadcounts() {
        return downloadcounts;
    }

    public void setDownloadcounts(Long downloadcounts) {
        this.downloadcounts = downloadcounts;
    }

    public String getSofttype() {
        return softtype;
    }

    public void setSofttype(String softtype) {
        this.softtype = softtype == null ? null : softtype.trim();
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }
}