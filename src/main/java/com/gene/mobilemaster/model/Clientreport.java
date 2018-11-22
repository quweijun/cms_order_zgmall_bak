package com.gene.mobilemaster.model;

import java.util.Date;

public class Clientreport {
    private Double flowid;

    private String username;

    private String content;

    private Date adddate;

    private String contact;

    public Double getFlowid() {
        return flowid;
    }

    public void setFlowid(Double flowid) {
        this.flowid = flowid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getAdddate() {
        return adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }
}