package com.zgmall.vo.provide;

import com.zgmall.model.provide.Provide;


public class ProvideVo extends Provide {
    private Integer  p=1;
    private Integer  psize=0;
    public int getP() {
        return p;
    }
    public void setP(int p) {this.p = p;}
    public int getPsize(){return psize;}
    public void setPsize(int psize){this.psize=psize;}
}
