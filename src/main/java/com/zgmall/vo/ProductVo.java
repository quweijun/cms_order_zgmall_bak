package com.zgmall.vo;

import com.zgmall.controller.product.ProductController;
import com.zgmall.model.product.JDProductLib;

import java.math.BigDecimal;

public class ProductVo extends JDProductLib{
    private Integer  p=1;
    private Integer  psize=15;
    private String searchbrand;
    private String searchword;
    public int getP() {
        return p;
    }
    public void setP(int p) {this.p = p;}
    public int getPsize(){return psize;}
    public void setPsize(int psize){this.psize=psize;}


    public String getSearchword() {
        return searchword;
    }

    public void setSearchword(String searchword) {
        this.searchword = searchword;
    }

    public String getSearchbrand() {
        return searchbrand;
    }

    public void setSearchbrand(String searchbrand) {
        this.searchbrand = searchbrand;
    }
}