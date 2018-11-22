package com.gene.mobilemaster.model;

import java.util.Date;

public class Servicetrackdesc {
    private Integer flowid;

    private Integer serviceid;

    private Integer thestate;

    private String operator;

    private String kfdesc;

    private Date addtime;

    public Integer getFlowid() {
        return flowid;
    }

    public void setFlowid(Integer flowid) {
        this.flowid = flowid;
    }

    public Integer getServiceid() {
        return serviceid;
    }

    public void setServiceid(Integer serviceid) {
        this.serviceid = serviceid;
    }

    public Integer getThestate() {
        return thestate;
    }

    public void setThestate(Integer thestate) {
        this.thestate = thestate;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getKfdesc() {
        return kfdesc;
    }

    public void setKfdesc(String kfdesc) {
        this.kfdesc = kfdesc == null ? null : kfdesc.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}