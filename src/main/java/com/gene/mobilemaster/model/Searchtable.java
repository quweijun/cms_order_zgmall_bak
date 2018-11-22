package com.gene.mobilemaster.model;

import java.util.Date;

public class Searchtable {
    private Integer id;

    private Integer xswz;

    private Integer subchannel;

    private Integer keytype;

    private String keyname;

    private String keyurl;

    private Integer flag;

    private Date addtime;

    private String addor;

    private Integer taxis;

    private String ubbcontent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getXswz() {
        return xswz;
    }

    public void setXswz(Integer xswz) {
        this.xswz = xswz;
    }

    public Integer getSubchannel() {
        return subchannel;
    }

    public void setSubchannel(Integer subchannel) {
        this.subchannel = subchannel;
    }

    public Integer getKeytype() {
        return keytype;
    }

    public void setKeytype(Integer keytype) {
        this.keytype = keytype;
    }

    public String getKeyname() {
        return keyname;
    }

    public void setKeyname(String keyname) {
        this.keyname = keyname == null ? null : keyname.trim();
    }

    public String getKeyurl() {
        return keyurl;
    }

    public void setKeyurl(String keyurl) {
        this.keyurl = keyurl == null ? null : keyurl.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getAddor() {
        return addor;
    }

    public void setAddor(String addor) {
        this.addor = addor == null ? null : addor.trim();
    }

    public Integer getTaxis() {
        return taxis;
    }

    public void setTaxis(Integer taxis) {
        this.taxis = taxis;
    }

    public String getUbbcontent() {
        return ubbcontent;
    }

    public void setUbbcontent(String ubbcontent) {
        this.ubbcontent = ubbcontent == null ? null : ubbcontent.trim();
    }
}