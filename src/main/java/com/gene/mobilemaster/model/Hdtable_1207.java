package com.gene.mobilemaster.model;

import java.util.Date;

public class Hdtable_1207 {
    private Integer hdid;

    private Integer hdtype;

    private Integer subchannel;

    private String hdname;

    private String hdphoto;

    private String photourl;

    private Date begindate;

    private Date enddate;

    private Integer location;

    private String hddesc;

    private Date addtime;

    private String addor;

    private Integer flag;

    private Integer photoflag;

    public Integer getHdid() {
        return hdid;
    }

    public void setHdid(Integer hdid) {
        this.hdid = hdid;
    }

    public Integer getHdtype() {
        return hdtype;
    }

    public void setHdtype(Integer hdtype) {
        this.hdtype = hdtype;
    }

    public Integer getSubchannel() {
        return subchannel;
    }

    public void setSubchannel(Integer subchannel) {
        this.subchannel = subchannel;
    }

    public String getHdname() {
        return hdname;
    }

    public void setHdname(String hdname) {
        this.hdname = hdname == null ? null : hdname.trim();
    }

    public String getHdphoto() {
        return hdphoto;
    }

    public void setHdphoto(String hdphoto) {
        this.hdphoto = hdphoto == null ? null : hdphoto.trim();
    }

    public String getPhotourl() {
        return photourl;
    }

    public void setPhotourl(String photourl) {
        this.photourl = photourl == null ? null : photourl.trim();
    }

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    public String getHddesc() {
        return hddesc;
    }

    public void setHddesc(String hddesc) {
        this.hddesc = hddesc == null ? null : hddesc.trim();
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

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getPhotoflag() {
        return photoflag;
    }

    public void setPhotoflag(Integer photoflag) {
        this.photoflag = photoflag;
    }
}