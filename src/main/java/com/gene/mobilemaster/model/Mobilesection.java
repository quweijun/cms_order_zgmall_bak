package com.gene.mobilemaster.model;

import java.util.Date;

public class Mobilesection {
    private Long flowid;

    private String sections;

    private String editor;

    private Integer flag;

    private Date addtime;

    public Long getFlowid() {
        return flowid;
    }

    public void setFlowid(Long flowid) {
        this.flowid = flowid;
    }

    public String getSections() {
        return sections;
    }

    public void setSections(String sections) {
        this.sections = sections == null ? null : sections.trim();
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