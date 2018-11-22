package com.gene.mobilemaster.model;

public class Total {
    private String productid;

    private String productname;

    private String warecolor;

    private String waresize;

    private Integer flag2;

    private Integer total;

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

    public Integer getFlag2() {
        return flag2;
    }

    public void setFlag2(Integer flag2) {
        this.flag2 = flag2;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}