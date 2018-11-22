package com.gene.mobilemaster.model;

public class Spaceword {
    private String keyword;

    private Integer searchtimes;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public Integer getSearchtimes() {
        return searchtimes;
    }

    public void setSearchtimes(Integer searchtimes) {
        this.searchtimes = searchtimes;
    }
}