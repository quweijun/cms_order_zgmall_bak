package com.gene.mobilemaster.model;

import java.util.Date;

public class Holidayperiod {
    private Long id;

    private Integer holidayperiodid;

    private Integer holidayperiodtype;

    private String holidayperiodname;

    private String holidaypic;

    private String promotionsid;

    private Date begintime;

    private Date endtime;

    private Integer enableflag;

    private Integer containsother;

    private String operator;

    private Date addtime;

    private String addor;

    private Integer thesumofholidayperiod;

    private Integer nostarthits;

    private Integer starthits;

    private String lastuptuser;

    private Date lastupttime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getHolidayperiodid() {
        return holidayperiodid;
    }

    public void setHolidayperiodid(Integer holidayperiodid) {
        this.holidayperiodid = holidayperiodid;
    }

    public Integer getHolidayperiodtype() {
        return holidayperiodtype;
    }

    public void setHolidayperiodtype(Integer holidayperiodtype) {
        this.holidayperiodtype = holidayperiodtype;
    }

    public String getHolidayperiodname() {
        return holidayperiodname;
    }

    public void setHolidayperiodname(String holidayperiodname) {
        this.holidayperiodname = holidayperiodname == null ? null : holidayperiodname.trim();
    }

    public String getHolidaypic() {
        return holidaypic;
    }

    public void setHolidaypic(String holidaypic) {
        this.holidaypic = holidaypic == null ? null : holidaypic.trim();
    }

    public String getPromotionsid() {
        return promotionsid;
    }

    public void setPromotionsid(String promotionsid) {
        this.promotionsid = promotionsid == null ? null : promotionsid.trim();
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getEnableflag() {
        return enableflag;
    }

    public void setEnableflag(Integer enableflag) {
        this.enableflag = enableflag;
    }

    public Integer getContainsother() {
        return containsother;
    }

    public void setContainsother(Integer containsother) {
        this.containsother = containsother;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getAddor() {
        return addor;
    }

    public void setAddor(String addor) {
        this.addor = addor == null ? null : addor.trim();
    }

    public Integer getThesumofholidayperiod() {
        return thesumofholidayperiod;
    }

    public void setThesumofholidayperiod(Integer thesumofholidayperiod) {
        this.thesumofholidayperiod = thesumofholidayperiod;
    }

    public Integer getNostarthits() {
        return nostarthits;
    }

    public void setNostarthits(Integer nostarthits) {
        this.nostarthits = nostarthits;
    }

    public Integer getStarthits() {
        return starthits;
    }

    public void setStarthits(Integer starthits) {
        this.starthits = starthits;
    }

    public String getLastuptuser() {
        return lastuptuser;
    }

    public void setLastuptuser(String lastuptuser) {
        this.lastuptuser = lastuptuser == null ? null : lastuptuser.trim();
    }

    public Date getLastupttime() {
        return lastupttime;
    }

    public void setLastupttime(Date lastupttime) {
        this.lastupttime = lastupttime;
    }
}