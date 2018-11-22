package com.gene.mobilemaster.model;

import java.util.Date;

public class Sp_storage {
    private Integer id;

    private String orderid;

    private Integer barcodeid;

    private String editor;

    private Date addtime;

    private String beizhu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Integer getBarcodeid() {
        return barcodeid;
    }

    public void setBarcodeid(Integer barcodeid) {
        this.barcodeid = barcodeid;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor == null ? null : editor.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }
}