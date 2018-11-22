package com.gene.mobilemaster.model;

public class Tb_spaceinfotable {
    private Integer id;

    private String name;

    private String rows;

    private String reserved;

    private String data;

    private String indexSize;

    private String unused;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRows() {
        return rows;
    }

    public void setRows(String rows) {
        this.rows = rows == null ? null : rows.trim();
    }

    public String getReserved() {
        return reserved;
    }

    public void setReserved(String reserved) {
        this.reserved = reserved == null ? null : reserved.trim();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }

    public String getIndexSize() {
        return indexSize;
    }

    public void setIndexSize(String indexSize) {
        this.indexSize = indexSize == null ? null : indexSize.trim();
    }

    public String getUnused() {
        return unused;
    }

    public void setUnused(String unused) {
        this.unused = unused == null ? null : unused.trim();
    }
}