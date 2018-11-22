package com.gene.mobilemaster.model;

import java.util.Date;

public class Jifendh {
    private Long flowid;

    private Long customerid;

    private String dhLeixing;

    private String dhJifen;

    private String dhJiazhi;

    private String editor;

    private String remarks;

    private Date addtime;

    public Long getFlowid() {
        return flowid;
    }

    public void setFlowid(Long flowid) {
        this.flowid = flowid;
    }

    public Long getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Long customerid) {
        this.customerid = customerid;
    }

    public String getDhLeixing() {
        return dhLeixing;
    }

    public void setDhLeixing(String dhLeixing) {
        this.dhLeixing = dhLeixing == null ? null : dhLeixing.trim();
    }

    public String getDhJifen() {
        return dhJifen;
    }

    public void setDhJifen(String dhJifen) {
        this.dhJifen = dhJifen == null ? null : dhJifen.trim();
    }

    public String getDhJiazhi() {
        return dhJiazhi;
    }

    public void setDhJiazhi(String dhJiazhi) {
        this.dhJiazhi = dhJiazhi == null ? null : dhJiazhi.trim();
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor == null ? null : editor.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}