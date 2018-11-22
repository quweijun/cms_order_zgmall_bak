package com.gene.mobilemaster.model;

public class Salescount {
    private String productid;

    private Integer signfor;

    private Integer sendback;

    private Integer nosign;

    private String datetime;

    private Integer reject;

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public Integer getSignfor() {
        return signfor;
    }

    public void setSignfor(Integer signfor) {
        this.signfor = signfor;
    }

    public Integer getSendback() {
        return sendback;
    }

    public void setSendback(Integer sendback) {
        this.sendback = sendback;
    }

    public Integer getNosign() {
        return nosign;
    }

    public void setNosign(Integer nosign) {
        this.nosign = nosign;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime == null ? null : datetime.trim();
    }

    public Integer getReject() {
        return reject;
    }

    public void setReject(Integer reject) {
        this.reject = reject;
    }
}