package com.gene.mobilemaster.model;

import java.util.Date;

public class Channel_hd_config {
    private Integer id;

    private String hdname;

    private String hdDesc;

    private Double hdPrice;

    private String hdImg;

    private String adduser;

    private Date addtime;

    private String flag;

    private String channelid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHdname() {
        return hdname;
    }

    public void setHdname(String hdname) {
        this.hdname = hdname == null ? null : hdname.trim();
    }

    public String getHdDesc() {
        return hdDesc;
    }

    public void setHdDesc(String hdDesc) {
        this.hdDesc = hdDesc == null ? null : hdDesc.trim();
    }

    public Double getHdPrice() {
        return hdPrice;
    }

    public void setHdPrice(Double hdPrice) {
        this.hdPrice = hdPrice;
    }

    public String getHdImg() {
        return hdImg;
    }

    public void setHdImg(String hdImg) {
        this.hdImg = hdImg == null ? null : hdImg.trim();
    }

    public String getAdduser() {
        return adduser;
    }

    public void setAdduser(String adduser) {
        this.adduser = adduser == null ? null : adduser.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }
}