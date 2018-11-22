package com.gene.mobilemaster.model;

import java.util.Date;

public class Wa_l_productlist {
    private Long flowid;

    private String flbh;

    private Integer zgflc1;

    private Integer zgflc2;

    private Integer zgflc3;

    private String jdcpid;

    private String jdcpname;

    private Double jdcpprice;

    private Integer jdpageno;

    private Date createdate;

    private Integer downflag;

    private Date downdate;

    private Date lastmidifydate;

    private String cppricechangelist;

    private String imgurl;

    public Long getFlowid() {
        return flowid;
    }

    public void setFlowid(Long flowid) {
        this.flowid = flowid;
    }

    public String getFlbh() {
        return flbh;
    }

    public void setFlbh(String flbh) {
        this.flbh = flbh == null ? null : flbh.trim();
    }

    public Integer getZgflc1() {
        return zgflc1;
    }

    public void setZgflc1(Integer zgflc1) {
        this.zgflc1 = zgflc1;
    }

    public Integer getZgflc2() {
        return zgflc2;
    }

    public void setZgflc2(Integer zgflc2) {
        this.zgflc2 = zgflc2;
    }

    public Integer getZgflc3() {
        return zgflc3;
    }

    public void setZgflc3(Integer zgflc3) {
        this.zgflc3 = zgflc3;
    }

    public String getJdcpid() {
        return jdcpid;
    }

    public void setJdcpid(String jdcpid) {
        this.jdcpid = jdcpid == null ? null : jdcpid.trim();
    }

    public String getJdcpname() {
        return jdcpname;
    }

    public void setJdcpname(String jdcpname) {
        this.jdcpname = jdcpname == null ? null : jdcpname.trim();
    }

    public Double getJdcpprice() {
        return jdcpprice;
    }

    public void setJdcpprice(Double jdcpprice) {
        this.jdcpprice = jdcpprice;
    }

    public Integer getJdpageno() {
        return jdpageno;
    }

    public void setJdpageno(Integer jdpageno) {
        this.jdpageno = jdpageno;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getDownflag() {
        return downflag;
    }

    public void setDownflag(Integer downflag) {
        this.downflag = downflag;
    }

    public Date getDowndate() {
        return downdate;
    }

    public void setDowndate(Date downdate) {
        this.downdate = downdate;
    }

    public Date getLastmidifydate() {
        return lastmidifydate;
    }

    public void setLastmidifydate(Date lastmidifydate) {
        this.lastmidifydate = lastmidifydate;
    }

    public String getCppricechangelist() {
        return cppricechangelist;
    }

    public void setCppricechangelist(String cppricechangelist) {
        this.cppricechangelist = cppricechangelist == null ? null : cppricechangelist.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }
}