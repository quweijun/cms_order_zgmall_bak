package com.gene.mobilemaster.model;

import java.util.Date;

public class Hycompany_select {
    private Long flowid;

    private Integer hycompany;

    private String province;

    private String city;

    private String area;

    private Double allProduct;

    private Double dfhProduct;

    private Double yfhProduct;

    private Double qsProduct;

    private Double js1Product;

    private Double js2Product;

    private Double sh1Product;

    private Double sh2Product;

    private String beizhu;

    private String editor;

    private Date addtime;

    public Long getFlowid() {
        return flowid;
    }

    public void setFlowid(Long flowid) {
        this.flowid = flowid;
    }

    public Integer getHycompany() {
        return hycompany;
    }

    public void setHycompany(Integer hycompany) {
        this.hycompany = hycompany;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public Double getAllProduct() {
        return allProduct;
    }

    public void setAllProduct(Double allProduct) {
        this.allProduct = allProduct;
    }

    public Double getDfhProduct() {
        return dfhProduct;
    }

    public void setDfhProduct(Double dfhProduct) {
        this.dfhProduct = dfhProduct;
    }

    public Double getYfhProduct() {
        return yfhProduct;
    }

    public void setYfhProduct(Double yfhProduct) {
        this.yfhProduct = yfhProduct;
    }

    public Double getQsProduct() {
        return qsProduct;
    }

    public void setQsProduct(Double qsProduct) {
        this.qsProduct = qsProduct;
    }

    public Double getJs1Product() {
        return js1Product;
    }

    public void setJs1Product(Double js1Product) {
        this.js1Product = js1Product;
    }

    public Double getJs2Product() {
        return js2Product;
    }

    public void setJs2Product(Double js2Product) {
        this.js2Product = js2Product;
    }

    public Double getSh1Product() {
        return sh1Product;
    }

    public void setSh1Product(Double sh1Product) {
        this.sh1Product = sh1Product;
    }

    public Double getSh2Product() {
        return sh2Product;
    }

    public void setSh2Product(Double sh2Product) {
        this.sh2Product = sh2Product;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor == null ? null : editor.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}