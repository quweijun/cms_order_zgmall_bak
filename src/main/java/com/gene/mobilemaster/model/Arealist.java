package com.gene.mobilemaster.model;

public class Arealist {
    private Integer id;

    private String sheng;

    private String shengJp;

    private String shi;

    private String shiJp;

    private String qu;

    private String quJp;

    private String code;

    private Integer class2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSheng() {
        return sheng;
    }

    public void setSheng(String sheng) {
        this.sheng = sheng == null ? null : sheng.trim();
    }

    public String getShengJp() {
        return shengJp;
    }

    public void setShengJp(String shengJp) {
        this.shengJp = shengJp == null ? null : shengJp.trim();
    }

    public String getShi() {
        return shi;
    }

    public void setShi(String shi) {
        this.shi = shi == null ? null : shi.trim();
    }

    public String getShiJp() {
        return shiJp;
    }

    public void setShiJp(String shiJp) {
        this.shiJp = shiJp == null ? null : shiJp.trim();
    }

    public String getQu() {
        return qu;
    }

    public void setQu(String qu) {
        this.qu = qu == null ? null : qu.trim();
    }

    public String getQuJp() {
        return quJp;
    }

    public void setQuJp(String quJp) {
        this.quJp = quJp == null ? null : quJp.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getClass2() {
        return class2;
    }

    public void setClass2(Integer class2) {
        this.class2 = class2;
    }
}