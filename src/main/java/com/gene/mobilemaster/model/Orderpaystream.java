package com.gene.mobilemaster.model;

import java.util.Date;

public class Orderpaystream {
    private Long osid;

    private String orderid;

    private Double csprice;

    private Double csshopcatprice;

    private String cspaytype;

    private String cspaytag;

    private String outTradeNo;

    private String tradeNo;

    private Double cshaspay;

    private String ssname;

    private Date sstime;

    private Double ssprice;

    private String sspaytype;

    private String sspaytag;

    private String fsname;

    private Date fstime;

    private Double fsprice;

    private Double factprice;

    private String postname;

    public Long getOsid() {
        return osid;
    }

    public void setOsid(Long osid) {
        this.osid = osid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Double getCsprice() {
        return csprice;
    }

    public void setCsprice(Double csprice) {
        this.csprice = csprice;
    }

    public Double getCsshopcatprice() {
        return csshopcatprice;
    }

    public void setCsshopcatprice(Double csshopcatprice) {
        this.csshopcatprice = csshopcatprice;
    }

    public String getCspaytype() {
        return cspaytype;
    }

    public void setCspaytype(String cspaytype) {
        this.cspaytype = cspaytype == null ? null : cspaytype.trim();
    }

    public String getCspaytag() {
        return cspaytag;
    }

    public void setCspaytag(String cspaytag) {
        this.cspaytag = cspaytag == null ? null : cspaytag.trim();
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo == null ? null : outTradeNo.trim();
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public Double getCshaspay() {
        return cshaspay;
    }

    public void setCshaspay(Double cshaspay) {
        this.cshaspay = cshaspay;
    }

    public String getSsname() {
        return ssname;
    }

    public void setSsname(String ssname) {
        this.ssname = ssname == null ? null : ssname.trim();
    }

    public Date getSstime() {
        return sstime;
    }

    public void setSstime(Date sstime) {
        this.sstime = sstime;
    }

    public Double getSsprice() {
        return ssprice;
    }

    public void setSsprice(Double ssprice) {
        this.ssprice = ssprice;
    }

    public String getSspaytype() {
        return sspaytype;
    }

    public void setSspaytype(String sspaytype) {
        this.sspaytype = sspaytype == null ? null : sspaytype.trim();
    }

    public String getSspaytag() {
        return sspaytag;
    }

    public void setSspaytag(String sspaytag) {
        this.sspaytag = sspaytag == null ? null : sspaytag.trim();
    }

    public String getFsname() {
        return fsname;
    }

    public void setFsname(String fsname) {
        this.fsname = fsname == null ? null : fsname.trim();
    }

    public Date getFstime() {
        return fstime;
    }

    public void setFstime(Date fstime) {
        this.fstime = fstime;
    }

    public Double getFsprice() {
        return fsprice;
    }

    public void setFsprice(Double fsprice) {
        this.fsprice = fsprice;
    }

    public Double getFactprice() {
        return factprice;
    }

    public void setFactprice(Double factprice) {
        this.factprice = factprice;
    }

    public String getPostname() {
        return postname;
    }

    public void setPostname(String postname) {
        this.postname = postname == null ? null : postname.trim();
    }
}