package com.gene.mobilemaster.model;

public class Jushoudigital {
    private Long flowid;

    private String bigtypename;

    private String smalltypename;

    private String productid;

    private String productname;

    private Integer zaitu1;

    private Integer zaitu2;

    private Integer jushou1;

    private Integer jushou2;

    public Long getFlowid() {
        return flowid;
    }

    public void setFlowid(Long flowid) {
        this.flowid = flowid;
    }

    public String getBigtypename() {
        return bigtypename;
    }

    public void setBigtypename(String bigtypename) {
        this.bigtypename = bigtypename == null ? null : bigtypename.trim();
    }

    public String getSmalltypename() {
        return smalltypename;
    }

    public void setSmalltypename(String smalltypename) {
        this.smalltypename = smalltypename == null ? null : smalltypename.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public Integer getZaitu1() {
        return zaitu1;
    }

    public void setZaitu1(Integer zaitu1) {
        this.zaitu1 = zaitu1;
    }

    public Integer getZaitu2() {
        return zaitu2;
    }

    public void setZaitu2(Integer zaitu2) {
        this.zaitu2 = zaitu2;
    }

    public Integer getJushou1() {
        return jushou1;
    }

    public void setJushou1(Integer jushou1) {
        this.jushou1 = jushou1;
    }

    public Integer getJushou2() {
        return jushou2;
    }

    public void setJushou2(Integer jushou2) {
        this.jushou2 = jushou2;
    }
}