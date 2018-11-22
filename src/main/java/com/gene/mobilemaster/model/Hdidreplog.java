package com.gene.mobilemaster.model;

import java.util.Date;

public class Hdidreplog {
    private Integer flowno;

    private Integer inhdid;

    private Integer outhdid;

    private Date addtime;

    public Integer getFlowno() {
        return flowno;
    }

    public void setFlowno(Integer flowno) {
        this.flowno = flowno;
    }

    public Integer getInhdid() {
        return inhdid;
    }

    public void setInhdid(Integer inhdid) {
        this.inhdid = inhdid;
    }

    public Integer getOuthdid() {
        return outhdid;
    }

    public void setOuthdid(Integer outhdid) {
        this.outhdid = outhdid;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}