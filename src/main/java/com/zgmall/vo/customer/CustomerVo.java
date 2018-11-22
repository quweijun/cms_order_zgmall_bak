package com.zgmall.vo.customer;

import com.zgmall.model.customer.Customer;


public class CustomerVo extends Customer {
    private Integer  p;
    private Integer  psize=0;
    public int getP() {
        return p;
    }
    public void setP(int p) {this.p = p;}
    public int getPsize(){return psize;}
    public void setPsize(int psize){this.psize=psize;}
}
