package com.gene.mobilemaster.model;

import java.util.Date;

public class Sms_log {
    private Long flowid;

    private String smsdirect;

    private String mobile;

    private String content;

    private Date sendtime;

    public Long getFlowid() {
        return flowid;
    }

    public void setFlowid(Long flowid) {
        this.flowid = flowid;
    }

    public String getSmsdirect() {
        return smsdirect;
    }

    public void setSmsdirect(String smsdirect) {
        this.smsdirect = smsdirect == null ? null : smsdirect.trim();
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

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }
}