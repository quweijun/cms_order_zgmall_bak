package com.gene.mobilemaster.model;

import java.util.Date;

public class Logtracking_log {
    private Long flowid;

    private String orderid;

    private Integer hycompany;

    private String expressid;

    private String expressid2;

    private String ordername;

    private String orderphone;

    private String userid;

    private String editor;

    private String paisong;

    private Integer leixing;

    private Integer status;

    private Integer iscomplete;

    private String beizhu;

    private Date addtime;

    public Long getFlowid() {
        return flowid;
    }

    public void setFlowid(Long flowid) {
        this.flowid = flowid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Integer getHycompany() {
        return hycompany;
    }

    public void setHycompany(Integer hycompany) {
        this.hycompany = hycompany;
    }

    public String getExpressid() {
        return expressid;
    }

    public void setExpressid(String expressid) {
        this.expressid = expressid == null ? null : expressid.trim();
    }

    public String getExpressid2() {
        return expressid2;
    }

    public void setExpressid2(String expressid2) {
        this.expressid2 = expressid2 == null ? null : expressid2.trim();
    }

    public String getOrdername() {
        return ordername;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername == null ? null : ordername.trim();
    }

    public String getOrderphone() {
        return orderphone;
    }

    public void setOrderphone(String orderphone) {
        this.orderphone = orderphone == null ? null : orderphone.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor == null ? null : editor.trim();
    }

    public String getPaisong() {
        return paisong;
    }

    public void setPaisong(String paisong) {
        this.paisong = paisong == null ? null : paisong.trim();
    }

    public Integer getLeixing() {
        return leixing;
    }

    public void setLeixing(Integer leixing) {
        this.leixing = leixing;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIscomplete() {
        return iscomplete;
    }

    public void setIscomplete(Integer iscomplete) {
        this.iscomplete = iscomplete;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}