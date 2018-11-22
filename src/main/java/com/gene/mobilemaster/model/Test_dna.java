package com.gene.mobilemaster.model;

import java.util.Date;

public class Test_dna {
    private String text;

    private Date addtime;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}