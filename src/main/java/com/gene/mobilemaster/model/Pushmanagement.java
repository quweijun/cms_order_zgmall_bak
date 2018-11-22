package com.gene.mobilemaster.model;

import java.util.Date;

public class Pushmanagement {
    private Integer id;

    private Integer channelid;

    private String subdomainid;

    private String pushaddress;

    private String realaddress;

    private String pushmsg;

    private Date createdate;

    private Date updatedate;

    private String username;

    private String isvalid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getChannelid() {
        return channelid;
    }

    public void setChannelid(Integer channelid) {
        this.channelid = channelid;
    }

    public String getSubdomainid() {
        return subdomainid;
    }

    public void setSubdomainid(String subdomainid) {
        this.subdomainid = subdomainid == null ? null : subdomainid.trim();
    }

    public String getPushaddress() {
        return pushaddress;
    }

    public void setPushaddress(String pushaddress) {
        this.pushaddress = pushaddress == null ? null : pushaddress.trim();
    }

    public String getRealaddress() {
        return realaddress;
    }

    public void setRealaddress(String realaddress) {
        this.realaddress = realaddress == null ? null : realaddress.trim();
    }

    public String getPushmsg() {
        return pushmsg;
    }

    public void setPushmsg(String pushmsg) {
        this.pushmsg = pushmsg == null ? null : pushmsg.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getIsvalid() {
        return isvalid;
    }

    public void setIsvalid(String isvalid) {
        this.isvalid = isvalid == null ? null : isvalid.trim();
    }
}