package com.zgmall.vo.product;

import com.zgmall.model.product.Bigtype;


public class BigtypeVo extends Bigtype {
    private Integer  p=1;
    private Integer  psize=15;
    public int getP() {
        return p;
    }
    public void setP(int p) {this.p = p;}
    public int getPsize(){return psize;}
    public void setPsize(int psize){this.psize=psize;}
}
