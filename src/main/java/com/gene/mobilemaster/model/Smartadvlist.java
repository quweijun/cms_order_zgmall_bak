package com.gene.mobilemaster.model;

import java.util.Date;

public class Smartadvlist {
    private Integer pkid;

    private Integer channelid;

    private Integer positionid;

    private String adtype;

    private String adword;

    private String adurl;

    private Date adddate;

    private Byte isauto;

    public Integer getPkid() {
        return pkid;
    }

    public void setPkid(Integer pkid) {
        this.pkid = pkid;
    }

    public Integer getChannelid() {
        return channelid;
    }

    public void setChannelid(Integer channelid) {
        this.channelid = channelid;
    }

    public Integer getPositionid() {
        return positionid;
    }

    public void setPositionid(Integer positionid) {
        this.positionid = positionid;
    }

    public String getAdtype() {
        return adtype;
    }

    public void setAdtype(String adtype) {
        this.adtype = adtype == null ? null : adtype.trim();
    }

    public String getAdword() {
        return adword;
    }

    public void setAdword(String adword) {
        this.adword = adword == null ? null : adword.trim();
    }

    public String getAdurl() {
        return adurl;
    }

    public void setAdurl(String adurl) {
        this.adurl = adurl == null ? null : adurl.trim();
    }

    public Date getAdddate() {
        return adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }

    public Byte getIsauto() {
        return isauto;
    }

    public void setIsauto(Byte isauto) {
        this.isauto = isauto;
    }
}