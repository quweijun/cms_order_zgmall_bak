package com.gene.mobilemaster.model;

import java.util.Date;

public class Search_log_history {
    private Long searchid;

    private String searchkey;

    private String userid;

    private String channelid;

    private Integer result;

    private Date searchdate;

    private Integer flag;

    private Integer cnt;

    public Long getSearchid() {
        return searchid;
    }

    public void setSearchid(Long searchid) {
        this.searchid = searchid;
    }

    public String getSearchkey() {
        return searchkey;
    }

    public void setSearchkey(String searchkey) {
        this.searchkey = searchkey == null ? null : searchkey.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Date getSearchdate() {
        return searchdate;
    }

    public void setSearchdate(Date searchdate) {
        this.searchdate = searchdate;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getCnt() {
        return cnt;
    }

    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }
}