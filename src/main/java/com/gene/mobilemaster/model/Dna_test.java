package com.gene.mobilemaster.model;

import java.util.Date;

public class Dna_test {
    private String contents;

    private Date addtime;

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents == null ? null : contents.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}