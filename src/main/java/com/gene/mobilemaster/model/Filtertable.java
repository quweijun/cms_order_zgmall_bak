package com.gene.mobilemaster.model;

import java.util.Date;

public class Filtertable {
    private Long flowid;

    private String filtercontent;

    private String editor;

    private Date addtime;

    public Long getFlowid() {
        return flowid;
    }

    public void setFlowid(Long flowid) {
        this.flowid = flowid;
    }

    public String getFiltercontent() {
        return filtercontent;
    }

    public void setFiltercontent(String filtercontent) {
        this.filtercontent = filtercontent == null ? null : filtercontent.trim();
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
}