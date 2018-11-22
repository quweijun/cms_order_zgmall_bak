package com.gene.mobilemaster.model;

public class Provide_tracking {
    private Integer provideid;

    private String providename;

    private String bigtype;

    private String smalltype;

    private String linkman;

    private String telephone;

    private String qq;

    private String address;

    private String trackingman;

    public Integer getProvideid() {
        return provideid;
    }

    public void setProvideid(Integer provideid) {
        this.provideid = provideid;
    }

    public String getProvidename() {
        return providename;
    }

    public void setProvidename(String providename) {
        this.providename = providename == null ? null : providename.trim();
    }

    public String getBigtype() {
        return bigtype;
    }

    public void setBigtype(String bigtype) {
        this.bigtype = bigtype == null ? null : bigtype.trim();
    }

    public String getSmalltype() {
        return smalltype;
    }

    public void setSmalltype(String smalltype) {
        this.smalltype = smalltype == null ? null : smalltype.trim();
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getTrackingman() {
        return trackingman;
    }

    public void setTrackingman(String trackingman) {
        this.trackingman = trackingman == null ? null : trackingman.trim();
    }
}