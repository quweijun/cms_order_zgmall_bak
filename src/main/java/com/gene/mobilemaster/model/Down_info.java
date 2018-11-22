package com.gene.mobilemaster.model;

public class Down_info {
    private Integer id;

    private String title;

    private String content;

    private Integer bigtitle;

    private String url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getBigtitle() {
        return bigtitle;
    }

    public void setBigtitle(Integer bigtitle) {
        this.bigtitle = bigtitle;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}