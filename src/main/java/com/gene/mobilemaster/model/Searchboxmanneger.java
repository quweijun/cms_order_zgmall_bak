package com.gene.mobilemaster.model;

import java.util.Date;

public class Searchboxmanneger {
    private Integer id;

    private Integer pindaoid;

    private String keyword;

    private Integer flag;

    private Date addtime;

    private String operator;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPindaoid() {
        return pindaoid;
    }

    public void setPindaoid(Integer pindaoid) {
        this.pindaoid = pindaoid;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }
}