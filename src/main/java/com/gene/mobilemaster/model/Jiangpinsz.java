package com.gene.mobilemaster.model;

public class Jiangpinsz {
    private Long flowid;

    private String jiangxiang;

    private Integer minge;

    private String bigtypename;

    private String productid;

    private String productname;

    private Integer jilv;

    public Long getFlowid() {
        return flowid;
    }

    public void setFlowid(Long flowid) {
        this.flowid = flowid;
    }

    public String getJiangxiang() {
        return jiangxiang;
    }

    public void setJiangxiang(String jiangxiang) {
        this.jiangxiang = jiangxiang == null ? null : jiangxiang.trim();
    }

    public Integer getMinge() {
        return minge;
    }

    public void setMinge(Integer minge) {
        this.minge = minge;
    }

    public String getBigtypename() {
        return bigtypename;
    }

    public void setBigtypename(String bigtypename) {
        this.bigtypename = bigtypename == null ? null : bigtypename.trim();
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

    public Integer getJilv() {
        return jilv;
    }

    public void setJilv(Integer jilv) {
        this.jilv = jilv;
    }
}