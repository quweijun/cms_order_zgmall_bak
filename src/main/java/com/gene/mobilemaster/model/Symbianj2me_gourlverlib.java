package com.gene.mobilemaster.model;

import java.util.Date;

public class Symbianj2me_gourlverlib {
    private String urlversion;

    private Date addtime;

    private String enableflag;

    public String getUrlversion() {
        return urlversion;
    }

    public void setUrlversion(String urlversion) {
        this.urlversion = urlversion == null ? null : urlversion.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getEnableflag() {
        return enableflag;
    }

    public void setEnableflag(String enableflag) {
        this.enableflag = enableflag == null ? null : enableflag.trim();
    }
}