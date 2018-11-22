package com.gene.mobilemaster.model;

import java.util.Date;

public class Customermessage {
    private Long flowid;

    private Long customerid;

    private String message;

    private String type;

    private Date accesstime;

    private String operperson;

    private String readflag;

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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getAccesstime() {
        return accesstime;
    }

    public void setAccesstime(Date accesstime) {
        this.accesstime = accesstime;
    }

    public String getOperperson() {
        return operperson;
    }

    public void setOperperson(String operperson) {
        this.operperson = operperson == null ? null : operperson.trim();
    }

    public String getReadflag() {
        return readflag;
    }

    public void setReadflag(String readflag) {
        this.readflag = readflag == null ? null : readflag.trim();
    }
}