package com.gene.mobilemaster.model;

public class Pl_pinglun1 {
    private Double 序号;

    private String 商品id;

    private String 商品名称;

    private String 评价内容;

    private Double 分数;

    public Double get序号() {
        return 序号;
    }

    public void set序号(Double 序号) {
        this.序号 = 序号;
    }

    public String get商品id() {
        return 商品id;
    }

    public void set商品id(String 商品id) {
        this.商品id = 商品id == null ? null : 商品id.trim();
    }

    public String get商品名称() {
        return 商品名称;
    }

    public void set商品名称(String 商品名称) {
        this.商品名称 = 商品名称 == null ? null : 商品名称.trim();
    }

    public String get评价内容() {
        return 评价内容;
    }

    public void set评价内容(String 评价内容) {
        this.评价内容 = 评价内容 == null ? null : 评价内容.trim();
    }

    public Double get分数() {
        return 分数;
    }

    public void set分数(Double 分数) {
        this.分数 = 分数;
    }
}