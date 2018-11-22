package com.zgmall.vo.product;

import com.zgmall.model.product.Product_pv_shopcat_order;


public class Product_pv_shopcat_orderVo extends Product_pv_shopcat_order {
    private Integer  p=1;
    private Integer  psize=15;
    public int getP() {
        return p;
    }
    public void setP(int p) {this.p = p;}
    public int getPsize(){return psize;}
    public void setPsize(int psize){this.psize=psize;}
}
