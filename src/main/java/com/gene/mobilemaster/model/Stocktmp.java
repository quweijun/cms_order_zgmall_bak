package com.gene.mobilemaster.model;

public class Stocktmp {
    private String wareid;

    private String warecolor;

    private String waresize;

    private Integer stocksum;

    public String getWareid() {
        return wareid;
    }

    public void setWareid(String wareid) {
        this.wareid = wareid == null ? null : wareid.trim();
    }

    public String getWarecolor() {
        return warecolor;
    }

    public void setWarecolor(String warecolor) {
        this.warecolor = warecolor == null ? null : warecolor.trim();
    }

    public String getWaresize() {
        return waresize;
    }

    public void setWaresize(String waresize) {
        this.waresize = waresize == null ? null : waresize.trim();
    }

    public Integer getStocksum() {
        return stocksum;
    }

    public void setStocksum(Integer stocksum) {
        this.stocksum = stocksum;
    }
}