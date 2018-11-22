package com.gene.mobilemaster.model;

import java.util.Date;

public class Sms_tracking {
    private Long flowid;

    private String zddh;

    private String mddh;

    private String mddh2;

    private String orderid;

    private String productid;

    private String smsdirect;

    private String customerid;

    private String mobile;

    private String content;

    private Integer issuc;

    private String editor;

    private Date sendtime;

    private Date replytime;

    public Long getFlowid() {
        return flowid;
    }

    public void setFlowid(Long flowid) {
        this.flowid = flowid;
    }

    public String getZddh() {
        return zddh;
    }

    public void setZddh(String zddh) {
        this.zddh = zddh == null ? null : zddh.trim();
    }

    public String getMddh() {
        return mddh;
    }

    public void setMddh(String mddh) {
        this.mddh = mddh == null ? null : mddh.trim();
    }

    public String getMddh2() {
        return mddh2;
    }

    public void setMddh2(String mddh2) {
        this.mddh2 = mddh2 == null ? null : mddh2.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getSmsdirect() {
        return smsdirect;
    }

    public void setSmsdirect(String smsdirect) {
        this.smsdirect = smsdirect == null ? null : smsdirect.trim();
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getIssuc() {
        return issuc;
    }

    public void setIssuc(Integer issuc) {
        this.issuc = issuc;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor == null ? null : editor.trim();
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public Date getReplytime() {
        return replytime;
    }

    public void setReplytime(Date replytime) {
        this.replytime = replytime;
    }
}