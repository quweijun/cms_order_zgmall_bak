package com.gene.mobilemaster.model;

import java.util.Date;

public class P_chu_ru_ku {
    private Integer id;

    private String newProductid;

    private String oldProductid;

    private String barcodeid;

    private String productname;

    private String typename;

    private String smalltypename;

    private String prodcolor;

    private String prodsize;

    private String leixing;

    private String editor;

    private Integer flag;

    private Date addtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNewProductid() {
        return newProductid;
    }

    public void setNewProductid(String newProductid) {
        this.newProductid = newProductid == null ? null : newProductid.trim();
    }

    public String getOldProductid() {
        return oldProductid;
    }

    public void setOldProductid(String oldProductid) {
        this.oldProductid = oldProductid == null ? null : oldProductid.trim();
    }

    public String getBarcodeid() {
        return barcodeid;
    }

    public void setBarcodeid(String barcodeid) {
        this.barcodeid = barcodeid == null ? null : barcodeid.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public String getSmalltypename() {
        return smalltypename;
    }

    public void setSmalltypename(String smalltypename) {
        this.smalltypename = smalltypename == null ? null : smalltypename.trim();
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

    public String getLeixing() {
        return leixing;
    }

    public void setLeixing(String leixing) {
        this.leixing = leixing == null ? null : leixing.trim();
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor == null ? null : editor.trim();
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
}