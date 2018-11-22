package com.gene.mobilemaster.model;

public class Phonelist {
    private String col001;

    private String col002;

    public String getCol001() {
        return col001;
    }

    public void setCol001(String col001) {
        this.col001 = col001 == null ? null : col001.trim();
    }

    public String getCol002() {
        return col002;
    }

    public void setCol002(String col002) {
        this.col002 = col002 == null ? null : col002.trim();
    }
}