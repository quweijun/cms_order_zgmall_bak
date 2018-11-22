package com.zgmall.vo.order;

import com.zgmall.model.order.Bussinessorderform;


public class BussinessorderformVo extends Bussinessorderform {
    private Integer  p=1;
    private Integer  psize=15;
    public int getP() {
        return p;
    }
    public void setP(int p) {this.p = p;}
    public int getPsize(){return psize;}
    public void setPsize(int psize){this.psize=psize;}
}
