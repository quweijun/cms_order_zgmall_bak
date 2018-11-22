package com.gene.mobilemaster.model;

import java.util.Date;

public class Accessstatistics_tmpondayhour {
    private Long id;

    private String visitid;

    private String prodid;

    private Integer producttype;

    private String ggy;

    private String clicktype;

    private Long visitcount;

    private Long visitcount2;

    private Long notruevisitcount;

    private Long notruevisitcount2;

    private String url;

    private Date addtime;

    private Integer addtimehour;

    private String channelid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVisitid() {
        return visitid;
    }

    public void setVisitid(String visitid) {
        this.visitid = visitid == null ? null : visitid.trim();
    }

    public String getProdid() {
        return prodid;
    }

    public void setProdid(String prodid) {
        this.prodid = prodid == null ? null : prodid.trim();
    }

    public Integer getProducttype() {
        return producttype;
    }

    public void setProducttype(Integer producttype) {
        this.producttype = producttype;
    }

    public String getGgy() {
        return ggy;
    }

    public void setGgy(String ggy) {
        this.ggy = ggy == null ? null : ggy.trim();
    }

    public String getClicktype() {
        return clicktype;
    }

    public void setClicktype(String clicktype) {
        this.clicktype = clicktype == null ? null : clicktype.trim();
    }

    public Long getVisitcount() {
        return visitcount;
    }

    public void setVisitcount(Long visitcount) {
        this.visitcount = visitcount;
    }

    public Long getVisitcount2() {
        return visitcount2;
    }

    public void setVisitcount2(Long visitcount2) {
        this.visitcount2 = visitcount2;
    }

    public Long getNotruevisitcount() {
        return notruevisitcount;
    }

    public void setNotruevisitcount(Long notruevisitcount) {
        this.notruevisitcount = notruevisitcount;
    }

    public Long getNotruevisitcount2() {
        return notruevisitcount2;
    }

    public void setNotruevisitcount2(Long notruevisitcount2) {
        this.notruevisitcount2 = notruevisitcount2;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getAddtimehour() {
        return addtimehour;
    }

    public void setAddtimehour(Integer addtimehour) {
        this.addtimehour = addtimehour;
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }
}