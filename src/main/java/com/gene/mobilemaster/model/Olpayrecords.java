package com.gene.mobilemaster.model;

import java.util.Date;

public class Olpayrecords {
    private Long payid;

    private String fee;

    private String tradeNo;

    private Date addtime;

    private String outTradeNo;

    private String paytype;

    private String outTradeType;

    private Integer issuccess;

    private String tradeNoForalipay;

    private Date paytime;

    public Long getPayid() {
        return payid;
    }

    public void setPayid(Long payid) {
        this.payid = payid;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee == null ? null : fee.trim();
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo == null ? null : outTradeNo.trim();
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype == null ? null : paytype.trim();
    }

    public String getOutTradeType() {
        return outTradeType;
    }

    public void setOutTradeType(String outTradeType) {
        this.outTradeType = outTradeType == null ? null : outTradeType.trim();
    }

    public Integer getIssuccess() {
        return issuccess;
    }

    public void setIssuccess(Integer issuccess) {
        this.issuccess = issuccess;
    }

    public String getTradeNoForalipay() {
        return tradeNoForalipay;
    }

    public void setTradeNoForalipay(String tradeNoForalipay) {
        this.tradeNoForalipay = tradeNoForalipay == null ? null : tradeNoForalipay.trim();
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }
}