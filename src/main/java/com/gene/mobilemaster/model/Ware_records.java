package com.gene.mobilemaster.model;

import java.util.Date;

public class Ware_records {
    private Integer id;

    private Integer barcodeid;

    private String editor;

    private String caozuo;

    private String beizhu;

    private Date addtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getCaozuo() {
        return caozuo;
    }

    public void setCaozuo(String caozuo) {
        this.caozuo = caozuo == null ? null : caozuo.trim();
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}