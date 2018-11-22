package com.gene.mobilemaster.model;

import java.util.Date;

public class Olpayrecords_error {
    private Long payid;

    private String tradeNo;

    private String outTradeNo;

    private String tradeFee;

    private String outTradeFee;

    private Date addtime;

    private String remarks;

    public Long getPayid() {
        return payid;
    }

    public void setPayid(Long payid) {
        this.payid = payid;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo == null ? null : outTradeNo.trim();
    }

    public String getTradeFee() {
        return tradeFee;
    }

    public void setTradeFee(String tradeFee) {
        this.tradeFee = tradeFee == null ? null : tradeFee.trim();
    }

    public String getOutTradeFee() {
        return outTradeFee;
    }

    public void setOutTradeFee(String outTradeFee) {
        this.outTradeFee = outTradeFee == null ? null : outTradeFee.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}