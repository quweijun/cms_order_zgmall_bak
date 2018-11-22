package com.gene.mobilemaster.model;

public class Wa_l_producttableWithBLOBs extends Wa_l_producttable {
    private String productts;

    private String productcs;

    private String waCpjj;

    private String waCpcs;

    public String getProductts() {
        return productts;
    }

    public void setProductts(String productts) {
        this.productts = productts == null ? null : productts.trim();
    }

    public String getProductcs() {
        return productcs;
    }

    public void setProductcs(String productcs) {
        this.productcs = productcs == null ? null : productcs.trim();
    }

    public String getWaCpjj() {
        return waCpjj;
    }

    public void setWaCpjj(String waCpjj) {
        this.waCpjj = waCpjj == null ? null : waCpjj.trim();
    }

    public String getWaCpcs() {
        return waCpcs;
    }

    public void setWaCpcs(String waCpcs) {
        this.waCpcs = waCpcs == null ? null : waCpcs.trim();
    }
}