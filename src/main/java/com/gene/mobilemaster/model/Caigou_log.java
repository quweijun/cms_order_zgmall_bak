package com.gene.mobilemaster.model;

import java.util.Date;

public class Caigou_log {
    private String productid;

    private String prodcolor;

    private String prodsize;

    private Date addtime;

    private String editor;

    private String notes;

    private String caozuo;

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getProdcolor() {
        return prodcolor;
    }

    public void setProdcolor(String prodcolor) {
        this.prodcolor = prodcolor == null ? null : prodcolor.trim();
    }

    public String getProdsize() {
        return prodsize;
    }

    public void setProdsize(String prodsize) {
        this.prodsize = prodsize == null ? null : prodsize.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor == null ? null : editor.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public String getCaozuo() {
        return caozuo;
    }

    public void setCaozuo(String caozuo) {
        this.caozuo = caozuo == null ? null : caozuo.trim();
    }
}