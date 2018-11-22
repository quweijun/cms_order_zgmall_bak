package com.zgmall.common.vo;

import java.io.Serializable;

public class BaseVo implements Serializable {
    private Integer  p;
    private Integer  psize;
    public int getP() {
        return p;
    }
    public void setP(int p) {this.p = p;}
    public int getPsize(){return psize;}
    public void setPsize(int psize){this.psize=psize;}
}
