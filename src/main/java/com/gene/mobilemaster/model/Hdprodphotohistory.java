package com.gene.mobilemaster.model;

import java.util.Date;

public class Hdprodphotohistory {
    private Integer flowno;

    private Integer hdid;

    private String productid;

    private String custphoto;

    private Date addtime;

    private String addor;

    public Integer getFlowno() {
        return flowno;
    }

    public void setFlowno(Integer flowno) {
        this.flowno = flowno;
    }

    public Integer getHdid() {
        return hdid;
    }

    public void setHdid(Integer hdid) {
        this.hdid = hdid;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getCustphoto() {
        return custphoto;
    }

    public void setCustphoto(String custphoto) {
        this.custphoto = custphoto == null ? null : custphoto.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getAddor() {
        return addor;
    }

    public void setAddor(String addor) {
        this.addor = addor == null ? null : addor.trim();
    }
}