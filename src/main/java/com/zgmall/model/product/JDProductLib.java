package com.zgmall.model.product;

import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "jd_productlib")
public class JDProductLib {
    private Integer id;

    private String flbh;

    private String cpid;

    private Integer cprq;

    private String hpbl;

    private String cpname;

    private String cpurl;

    private String imgurl;

    private String jgurl;

    private BigDecimal jdjg;

    private BigDecimal zgjg;

    private String zgid;

    private Integer yssl;

    private String brand;

    private Integer enableflag;

    private Integer zgflc1;

    private Integer zgflc2;

    private Integer zgflc3;

    private Integer brandid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFlbh() {
        return flbh;
    }

    public void setFlbh(String flbh) {
        this.flbh = flbh == null ? null : flbh.trim();
    }

    public String getCpid() {
        return cpid;
    }

    public void setCpid(String cpid) {
        this.cpid = cpid == null ? null : cpid.trim();
    }

    public Integer getCprq() {
        return cprq;
    }

    public void setCprq(Integer cprq) {
        this.cprq = cprq;
    }

    public String getHpbl() {
        return hpbl;
    }

    public void setHpbl(String hpbl) {
        this.hpbl = hpbl == null ? null : hpbl.trim();
    }

    public String getCpname() {
        return cpname;
    }

    public void setCpname(String cpname) {
        this.cpname = cpname == null ? null : cpname.trim();
    }

    public String getCpurl() {
        return cpurl;
    }

    public void setCpurl(String cpurl) {
        this.cpurl = cpurl == null ? null : cpurl.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public String getJgurl() {
        return jgurl;
    }

    public void setJgurl(String jgurl) {
        this.jgurl = jgurl == null ? null : jgurl.trim();
    }

    public BigDecimal getJdjg() {
        return jdjg;
    }

    public void setJdjg(BigDecimal jdjg) {
        this.jdjg = jdjg;
    }

    public BigDecimal getZgjg() {
        return zgjg;
    }

    public void setZgjg(BigDecimal zgjg) {
        this.zgjg = zgjg;
    }

    public String getZgid() {
        return zgid;
    }

    public void setZgid(String zgid) {
        this.zgid = zgid == null ? null : zgid.trim();
    }

    public Integer getYssl() {
        return yssl;
    }

    public void setYssl(Integer yssl) {
        this.yssl = yssl;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public Integer getEnableflag() {
        return enableflag;
    }

    public void setEnableflag(Integer enableflag) {
        this.enableflag = enableflag;
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

    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

}