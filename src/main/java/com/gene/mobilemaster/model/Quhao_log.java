package com.gene.mobilemaster.model;

import java.util.Date;

public class Quhao_log {
    private Long id;

    private Integer quhaotype;

    private String mobile;

    private String ua;

    private String mobiletype;

    private String channelid;

    private String productid;

    private Integer flag;

    private String spec;

    private String md5name;

    private Date addtime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuhaotype() {
        return quhaotype;
    }

    public void setQuhaotype(Integer quhaotype) {
        this.quhaotype = quhaotype;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getUa() {
        return ua;
    }

    public void setUa(String ua) {
        this.ua = ua == null ? null : ua.trim();
    }

    public String getMobiletype() {
        return mobiletype;
    }

    public void setMobiletype(String mobiletype) {
        this.mobiletype = mobiletype == null ? null : mobiletype.trim();
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec == null ? null : spec.trim();
    }

    public String getMd5name() {
        return md5name;
    }

    public void setMd5name(String md5name) {
        this.md5name = md5name == null ? null : md5name.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}