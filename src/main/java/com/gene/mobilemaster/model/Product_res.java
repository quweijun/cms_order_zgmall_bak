package com.gene.mobilemaster.model;

public class Product_res {
    private String productid;

    private String productname;

    private String zhengpin;

    private String isbao;

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

    public String getZhengpin() {
        return zhengpin;
    }

    public void setZhengpin(String zhengpin) {
        this.zhengpin = zhengpin == null ? null : zhengpin.trim();
    }

    public String getIsbao() {
        return isbao;
    }

    public void setIsbao(String isbao) {
        this.isbao = isbao == null ? null : isbao.trim();
    }
}