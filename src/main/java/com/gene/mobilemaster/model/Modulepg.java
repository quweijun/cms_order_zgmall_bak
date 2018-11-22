package com.gene.mobilemaster.model;

import java.util.Date;

public class Modulepg {
    private Integer sid;

    private Integer pgid;

    private String pgname;

    private String pgcontent;

    private String pglx;

    private String pgbz;

    private Date addtime;

    private Date updatetime;

    private String adduser;

    private String templateflag;

    private String enableflag;

    private String showtitle;

    private String ymlx;

    private Integer ymlxNofitpgid;

    private String dqms;

    private String topbanner;

    private String bottombanner;

    private Integer gotopgid;

    private String style;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getPgid() {
        return pgid;
    }

    public void setPgid(Integer pgid) {
        this.pgid = pgid;
    }

    public String getPgname() {
        return pgname;
    }

    public void setPgname(String pgname) {
        this.pgname = pgname == null ? null : pgname.trim();
    }

    public String getPgcontent() {
        return pgcontent;
    }

    public void setPgcontent(String pgcontent) {
        this.pgcontent = pgcontent == null ? null : pgcontent.trim();
    }

    public String getPglx() {
        return pglx;
    }

    public void setPglx(String pglx) {
        this.pglx = pglx == null ? null : pglx.trim();
    }

    public String getPgbz() {
        return pgbz;
    }

    public void setPgbz(String pgbz) {
        this.pgbz = pgbz == null ? null : pgbz.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getAdduser() {
        return adduser;
    }

    public void setAdduser(String adduser) {
        this.adduser = adduser == null ? null : adduser.trim();
    }

    public String getTemplateflag() {
        return templateflag;
    }

    public void setTemplateflag(String templateflag) {
        this.templateflag = templateflag == null ? null : templateflag.trim();
    }

    public String getEnableflag() {
        return enableflag;
    }

    public void setEnableflag(String enableflag) {
        this.enableflag = enableflag == null ? null : enableflag.trim();
    }

    public String getShowtitle() {
        return showtitle;
    }

    public void setShowtitle(String showtitle) {
        this.showtitle = showtitle == null ? null : showtitle.trim();
    }

    public String getYmlx() {
        return ymlx;
    }

    public void setYmlx(String ymlx) {
        this.ymlx = ymlx == null ? null : ymlx.trim();
    }

    public Integer getYmlxNofitpgid() {
        return ymlxNofitpgid;
    }

    public void setYmlxNofitpgid(Integer ymlxNofitpgid) {
        this.ymlxNofitpgid = ymlxNofitpgid;
    }

    public String getDqms() {
        return dqms;
    }

    public void setDqms(String dqms) {
        this.dqms = dqms == null ? null : dqms.trim();
    }

    public String getTopbanner() {
        return topbanner;
    }

    public void setTopbanner(String topbanner) {
        this.topbanner = topbanner == null ? null : topbanner.trim();
    }

    public String getBottombanner() {
        return bottombanner;
    }

    public void setBottombanner(String bottombanner) {
        this.bottombanner = bottombanner == null ? null : bottombanner.trim();
    }

    public Integer getGotopgid() {
        return gotopgid;
    }

    public void setGotopgid(Integer gotopgid) {
        this.gotopgid = gotopgid;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style == null ? null : style.trim();
    }
}