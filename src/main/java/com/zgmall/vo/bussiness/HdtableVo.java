package com.zgmall.vo.bussiness;

import com.zgmall.model.bussiness.Hdtable;


public class HdtableVo extends Hdtable {
    private Integer  p=1;
    private Integer  psize=15;
    public int getP() {
        return p;
    }
    public void setP(int p) {this.p = p;}
    public int getPsize(){return psize;}
    public void setPsize(int psize){this.psize=psize;}
}
