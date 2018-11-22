package com.gene.mobilemaster.model;

public class Symbianj2me_gourlcfg {
    private String xh;

    private String cmwap;

    private String title;

    private String url;

    private String imageurl;

    private String urlversion;

    private Integer orders;

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh == null ? null : xh.trim();
    }

    public String getCmwap() {
        return cmwap;
    }

    public void setCmwap(String cmwap) {
        this.cmwap = cmwap == null ? null : cmwap.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl == null ? null : imageurl.trim();
    }

    public String getUrlversion() {
        return urlversion;
    }

    public void setUrlversion(String urlversion) {
        this.urlversion = urlversion == null ? null : urlversion.trim();
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }
}