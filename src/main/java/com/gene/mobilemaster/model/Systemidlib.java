package com.gene.mobilemaster.model;

public class Systemidlib {
    private Integer idcatalog;

    private String idname;

    private Long idcount;

    private String iddesc;

    public Integer getIdcatalog() {
        return idcatalog;
    }

    public void setIdcatalog(Integer idcatalog) {
        this.idcatalog = idcatalog;
    }

    public String getIdname() {
        return idname;
    }

    public void setIdname(String idname) {
        this.idname = idname == null ? null : idname.trim();
    }

    public Long getIdcount() {
        return idcount;
    }

    public void setIdcount(Long idcount) {
        this.idcount = idcount;
    }

    public String getIddesc() {
        return iddesc;
    }

    public void setIddesc(String iddesc) {
        this.iddesc = iddesc == null ? null : iddesc.trim();
    }
}