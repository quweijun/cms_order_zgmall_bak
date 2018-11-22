package com.gene.mobilemaster.model;

import java.util.Date;

public class Provide {
    private Integer id;

    private Integer pid;

    private String providename;

    private String address;

    private String telephone;

    private String fax;

    private String linkman;

    private String mobile;

    private String remark;

    private Integer flag;

    private String addtor;

    private Date addtime;

    private String provideid;

    private String qq;

    private String trackingman;

    private String shContact;

    private String shMobile;

    private String shAddress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getProvidename() {
        return providename;
    }

    public void setProvidename(String providename) {
        this.providename = providename == null ? null : providename.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getAddtor() {
        return addtor;
    }

    public void setAddtor(String addtor) {
        this.addtor = addtor == null ? null : addtor.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getProvideid() {
        return provideid;
    }

    public void setProvideid(String provideid) {
        this.provideid = provideid == null ? null : provideid.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getTrackingman() {
        return trackingman;
    }

    public void setTrackingman(String trackingman) {
        this.trackingman = trackingman == null ? null : trackingman.trim();
    }

    public String getShContact() {
        return shContact;
    }

    public void setShContact(String shContact) {
        this.shContact = shContact == null ? null : shContact.trim();
    }

    public String getShMobile() {
        return shMobile;
    }

    public void setShMobile(String shMobile) {
        this.shMobile = shMobile == null ? null : shMobile.trim();
    }

    public String getShAddress() {
        return shAddress;
    }

    public void setShAddress(String shAddress) {
        this.shAddress = shAddress == null ? null : shAddress.trim();
    }
}