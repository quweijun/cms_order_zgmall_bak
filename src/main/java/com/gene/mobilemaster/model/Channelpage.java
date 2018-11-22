package com.gene.mobilemaster.model;

public class Channelpage {
    private Long flowid;

    private String channelid;

    private String pageid;

    private String pagecolid;

    private String img;

    private String pagecontent;

    private Integer xh;

    private String enableflag;

    private Integer pagetype;

    public Long getFlowid() {
        return flowid;
    }

    public void setFlowid(Long flowid) {
        this.flowid = flowid;
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }

    public String getPageid() {
        return pageid;
    }

    public void setPageid(String pageid) {
        this.pageid = pageid == null ? null : pageid.trim();
    }

    public String getPagecolid() {
        return pagecolid;
    }

    public void setPagecolid(String pagecolid) {
        this.pagecolid = pagecolid == null ? null : pagecolid.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getPagecontent() {
        return pagecontent;
    }

    public void setPagecontent(String pagecontent) {
        this.pagecontent = pagecontent == null ? null : pagecontent.trim();
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public String getEnableflag() {
        return enableflag;
    }

    public void setEnableflag(String enableflag) {
        this.enableflag = enableflag == null ? null : enableflag.trim();
    }

    public Integer getPagetype() {
        return pagetype;
    }

    public void setPagetype(Integer pagetype) {
        this.pagetype = pagetype;
    }
}