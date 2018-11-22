package com.gene.mobilemaster.model;

import java.util.Date;

public class Prodreplog {
    private Long flowno;

    private String inprodid;

    private String outprodid;

    private Date addtime;

    public Long getFlowno() {
        return flowno;
    }

    public void setFlowno(Long flowno) {
        this.flowno = flowno;
    }

    public String getInprodid() {
        return inprodid;
    }

    public void setInprodid(String inprodid) {
        this.inprodid = inprodid == null ? null : inprodid.trim();
    }

    public String getOutprodid() {
        return outprodid;
    }

    public void setOutprodid(String outprodid) {
        this.outprodid = outprodid == null ? null : outprodid.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}