package com.gene.mobilemaster.model;

import java.util.Date;

public class Congzhilog {
    private Long flowid;

    private Long customerid;

    private Double amount;

    private Date accesstime;

    private String type;

    private String bzdesc;

    private String cardno;

    private String addperson;

    private String r2Trxid;

    private String orderid;

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

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getAccesstime() {
        return accesstime;
    }

    public void setAccesstime(Date accesstime) {
        this.accesstime = accesstime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getBzdesc() {
        return bzdesc;
    }

    public void setBzdesc(String bzdesc) {
        this.bzdesc = bzdesc == null ? null : bzdesc.trim();
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    public String getAddperson() {
        return addperson;
    }

    public void setAddperson(String addperson) {
        this.addperson = addperson == null ? null : addperson.trim();
    }

    public String getR2Trxid() {
        return r2Trxid;
    }

    public void setR2Trxid(String r2Trxid) {
        this.r2Trxid = r2Trxid == null ? null : r2Trxid.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }
}