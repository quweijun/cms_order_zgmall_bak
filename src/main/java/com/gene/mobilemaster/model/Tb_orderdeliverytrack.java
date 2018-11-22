package com.gene.mobilemaster.model;

import java.util.Date;

public class Tb_orderdeliverytrack {
    private Long flowno;

    private String orderid;

    private Date odtStatusupttime;

    private String odtCsnotes;

    private String odtNotes;

    private String userid;

    private String mobile;

    private String odtSendmark;

    private String enableflag;

    private Date odtSubmittime;

    private Integer odttype;

    public Long getFlowno() {
        return flowno;
    }

    public void setFlowno(Long flowno) {
        this.flowno = flowno;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Date getOdtStatusupttime() {
        return odtStatusupttime;
    }

    public void setOdtStatusupttime(Date odtStatusupttime) {
        this.odtStatusupttime = odtStatusupttime;
    }

    public String getOdtCsnotes() {
        return odtCsnotes;
    }

    public void setOdtCsnotes(String odtCsnotes) {
        this.odtCsnotes = odtCsnotes == null ? null : odtCsnotes.trim();
    }

    public String getOdtNotes() {
        return odtNotes;
    }

    public void setOdtNotes(String odtNotes) {
        this.odtNotes = odtNotes == null ? null : odtNotes.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getOdtSendmark() {
        return odtSendmark;
    }

    public void setOdtSendmark(String odtSendmark) {
        this.odtSendmark = odtSendmark == null ? null : odtSendmark.trim();
    }

    public String getEnableflag() {
        return enableflag;
    }

    public void setEnableflag(String enableflag) {
        this.enableflag = enableflag == null ? null : enableflag.trim();
    }

    public Date getOdtSubmittime() {
        return odtSubmittime;
    }

    public void setOdtSubmittime(Date odtSubmittime) {
        this.odtSubmittime = odtSubmittime;
    }

    public Integer getOdttype() {
        return odttype;
    }

    public void setOdttype(Integer odttype) {
        this.odttype = odttype;
    }
}