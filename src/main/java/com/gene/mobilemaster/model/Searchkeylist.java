package com.gene.mobilemaster.model;

public class Searchkeylist {
    private String searchkey;

    public String getSearchkey() {
        return searchkey;
    }

    public void setSearchkey(String searchkey) {
        this.searchkey = searchkey == null ? null : searchkey.trim();
    }
}