package com.gene.mobilemaster.model;

public class Upproducttable {
    private String productid;

    private String guanggao;

    private Double unitprice;

    private String prodcolor;

    private Double price;

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getGuanggao() {
        return guanggao;
    }

    public void setGuanggao(String guanggao) {
        this.guanggao = guanggao == null ? null : guanggao.trim();
    }

    public Double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Double unitprice) {
        this.unitprice = unitprice;
    }

    public String getProdcolor() {
        return prodcolor;
    }

    public void setProdcolor(String prodcolor) {
        this.prodcolor = prodcolor == null ? null : prodcolor.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}