package com.gene.mobilemaster.model;

import java.util.Date;

public class Zguserinfo {
    private Double registerflowno;

    private String useraccountno;

    private String userpwd;

    private String truename;

    private String mobilenumber;

    private String address;

    private Integer branch;

    private String flag;

    private Date registertime;

    private String adflag;

    private String fujiarole;

    private String channelid;

    private Date chgpwddate;

    private String chgpwdip;

    private String modulrole;

    public Double getRegisterflowno() {
        return registerflowno;
    }

    public void setRegisterflowno(Double registerflowno) {
        this.registerflowno = registerflowno;
    }

    public String getUseraccountno() {
        return useraccountno;
    }

    public void setUseraccountno(String useraccountno) {
        this.useraccountno = useraccountno == null ? null : useraccountno.trim();
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd == null ? null : userpwd.trim();
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename == null ? null : truename.trim();
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber == null ? null : mobilenumber.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getBranch() {
        return branch;
    }

    public void setBranch(Integer branch) {
        this.branch = branch;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    public String getAdflag() {
        return adflag;
    }

    public void setAdflag(String adflag) {
        this.adflag = adflag == null ? null : adflag.trim();
    }

    public String getFujiarole() {
        return fujiarole;
    }

    public void setFujiarole(String fujiarole) {
        this.fujiarole = fujiarole == null ? null : fujiarole.trim();
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }

    public Date getChgpwddate() {
        return chgpwddate;
    }

    public void setChgpwddate(Date chgpwddate) {
        this.chgpwddate = chgpwddate;
    }

    public String getChgpwdip() {
        return chgpwdip;
    }

    public void setChgpwdip(String chgpwdip) {
        this.chgpwdip = chgpwdip == null ? null : chgpwdip.trim();
    }

    public String getModulrole() {
        return modulrole;
    }

    public void setModulrole(String modulrole) {
        this.modulrole = modulrole == null ? null : modulrole.trim();
    }
}