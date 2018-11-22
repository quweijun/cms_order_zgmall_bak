package com.gene.mobilemaster.model;

import java.util.Date;

public class Message {
    private Integer id;

    private Integer type;

    private String productid;

    private String userid;

    private String content;

    private String mobile;

    private Date addtime;

    private String kfid;

    private String hfcontent;

    private Date revertime;

    private Integer flag;

    private Integer unread;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getKfid() {
        return kfid;
    }

    public void setKfid(String kfid) {
        this.kfid = kfid == null ? null : kfid.trim();
    }

    public String getHfcontent() {
        return hfcontent;
    }

    public void setHfcontent(String hfcontent) {
        this.hfcontent = hfcontent == null ? null : hfcontent.trim();
    }

    public Date getRevertime() {
        return revertime;
    }

    public void setRevertime(Date revertime) {
        this.revertime = revertime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getUnread() {
        return unread;
    }

    public void setUnread(Integer unread) {
        this.unread = unread;
    }
}