package com.gene.mobilemaster.model;

public class Zhl {
    private Integer tsum;

    private Integer zsum;

    private String type;

    private String sendtime;

    public Integer getTsum() {
        return tsum;
    }

    public void setTsum(Integer tsum) {
        this.tsum = tsum;
    }

    public Integer getZsum() {
        return zsum;
    }

    public void setZsum(Integer zsum) {
        this.zsum = zsum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getSendtime() {
        return sendtime;
    }

    public void setSendtime(String sendtime) {
        this.sendtime = sendtime == null ? null : sendtime.trim();
    }
}