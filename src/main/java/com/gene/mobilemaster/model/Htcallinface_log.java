package com.gene.mobilemaster.model;

import java.util.Date;

public class Htcallinface_log {
    private Long flowno;

    private String action;

    private String subtype;

    private String m;

    private String customerid;

    private String presskey;

    private String ip;

    private Date addtime;

    private Long ordercount;

    private Integer flag;

    private String editor;

    private Date edittime;

    private String remarks;

    private Integer lock;

    public Long getFlowno() {
        return flowno;
    }

    public void setFlowno(Long flowno) {
        this.flowno = flowno;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype == null ? null : subtype.trim();
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m == null ? null : m.trim();
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    public String getPresskey() {
        return presskey;
    }

    public void setPresskey(String presskey) {
        this.presskey = presskey == null ? null : presskey.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Long getOrdercount() {
        return ordercount;
    }

    public void setOrdercount(Long ordercount) {
        this.ordercount = ordercount;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor == null ? null : editor.trim();
    }

    public Date getEdittime() {
        return edittime;
    }

    public void setEdittime(Date edittime) {
        this.edittime = edittime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getLock() {
        return lock;
    }

    public void setLock(Integer lock) {
        this.lock = lock;
    }
}