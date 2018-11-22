package com.gene.mobilemaster.model;

public class Prodsalesarea {
    private String productid;

    private String salesarea;

    private String salesareaname;

    private Integer allowsales;

    private Integer areayh;

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getSalesarea() {
        return salesarea;
    }

    public void setSalesarea(String salesarea) {
        this.salesarea = salesarea == null ? null : salesarea.trim();
    }

    public String getSalesareaname() {
        return salesareaname;
    }

    public void setSalesareaname(String salesareaname) {
        this.salesareaname = salesareaname == null ? null : salesareaname.trim();
    }

    public Integer getAllowsales() {
        return allowsales;
    }

    public void setAllowsales(Integer allowsales) {
        this.allowsales = allowsales;
    }

    public Integer getAreayh() {
        return areayh;
    }

    public void setAreayh(Integer areayh) {
        this.areayh = areayh;
    }
}