package com.gene.mobilemaster.model;

public class Stockvsorder {
    private String wareid;

    private String bigtype;

    private String productname;

    private String warecolor;

    private String waresize;

    private Integer stocksum;

    private Integer ordersum;

    public String getWareid() {
        return wareid;
    }

    public void setWareid(String wareid) {
        this.wareid = wareid == null ? null : wareid.trim();
    }

    public String getBigtype() {
        return bigtype;
    }

    public void setBigtype(String bigtype) {
        this.bigtype = bigtype == null ? null : bigtype.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getWarecolor() {
        return warecolor;
    }

    public void setWarecolor(String warecolor) {
        this.warecolor = warecolor == null ? null : warecolor.trim();
    }

    public String getWaresize() {
        return waresize;
    }

    public void setWaresize(String waresize) {
        this.waresize = waresize == null ? null : waresize.trim();
    }

    public Integer getStocksum() {
        return stocksum;
    }

    public void setStocksum(Integer stocksum) {
        this.stocksum = stocksum;
    }

    public Integer getOrdersum() {
        return ordersum;
    }

    public void setOrdersum(Integer ordersum) {
        this.ordersum = ordersum;
    }
}