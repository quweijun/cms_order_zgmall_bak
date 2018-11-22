package com.gene.mobilemaster.model;

public class Ualib_checktrueuserclick {
    private Integer flowno;

    private String checkuakeyword;

    private Integer checktype;

    private Integer enableflag;

    public Integer getFlowno() {
        return flowno;
    }

    public void setFlowno(Integer flowno) {
        this.flowno = flowno;
    }

    public String getCheckuakeyword() {
        return checkuakeyword;
    }

    public void setCheckuakeyword(String checkuakeyword) {
        this.checkuakeyword = checkuakeyword == null ? null : checkuakeyword.trim();
    }

    public Integer getChecktype() {
        return checktype;
    }

    public void setChecktype(Integer checktype) {
        this.checktype = checktype;
    }

    public Integer getEnableflag() {
        return enableflag;
    }

    public void setEnableflag(Integer enableflag) {
        this.enableflag = enableflag;
    }
}