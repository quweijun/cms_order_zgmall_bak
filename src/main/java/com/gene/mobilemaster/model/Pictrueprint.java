package com.gene.mobilemaster.model;

import java.util.Date;

public class Pictrueprint {
    private Long flowid;

    private String productid;

    private Integer customerid;

    private String content;

    private String orderpictrue;

    private Integer flag;

    private Date addtime;

    public Long getFlowid() {
        return flowid;
    }

    public void setFlowid(Long flowid) {
        this.flowid = flowid;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getOrderpictrue() {
        return orderpictrue;
    }

    public void setOrderpictrue(String orderpictrue) {
        this.orderpictrue = orderpictrue == null ? null : orderpictrue.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}