package com.zgmall.model.bussiness;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Id;

public class Hdtable {
  @Id
  private Integer hdid;
  private String hdtemplate;
  private Integer hdtype;
  private Integer subchannel;
  private String hdname;
  private String hdphoto;
  private String photourl;
  private Date begindate;
  private Date enddate;
  private Integer location;
  private String hddesc;
  private Date addtime;
  private String addor;
  private Integer flag;
  private Integer photoflag;
  private Integer indexflag;
  private Integer pindaoflag;
  private String hdphoto_android;
  private Date lastupttime;
  private String lastuptuser;
  private Integer starthits;
  private Integer gqhdid;
  public Integer getHdid()
  {
    return this.hdid;
  }
  public String getHdtemplate()
  {
    return this.hdtemplate;
  }
  public Integer getHdtype()
  {
    return this.hdtype;
  }
  public Integer getSubchannel()
  {
    return this.subchannel;
  }
  public String getHdname()
  {
    return this.hdname;
  }
  public String getHdphoto()
  {
    return this.hdphoto;
  }
  public String getPhotourl()
  {
    return this.photourl;
  }
  public Date getBegindate()
  {
    return this.begindate;
  }
  public Date getEnddate()
  {
    return this.enddate;
  }
  public Integer getLocation()
  {
    return this.location;
  }
  public String getHddesc()
  {
    return this.hddesc;
  }
  public Date getAddtime()
  {
    return this.addtime;
  }
  public String getAddor()
  {
    return this.addor;
  }
  public Integer getFlag()
  {
    return this.flag;
  }
  public Integer getPhotoflag()
  {
    return this.photoflag;
  }
  public Integer getIndexflag()
  {
    return this.indexflag;
  }
  public Integer getPindaoflag()
  {
    return this.pindaoflag;
  }
  public String getHdphoto_android()
  {
    return this.hdphoto_android;
  }
  public Date getLastupttime()
  {
    return this.lastupttime;
  }
  public String getLastuptuser()
  {
    return this.lastuptuser;
  }
  public Integer getStarthits()
  {
    return this.starthits;
  }
  public Integer getGqhdid()
  {
    return this.gqhdid;
  }
  public  void setHdid(Integer hdid)
  {
    this.hdid = hdid;
  }
  public  void setHdtemplate(String hdtemplate)
  {
    this.hdtemplate = hdtemplate;
  }
  public  void setHdtype(Integer hdtype)
  {
    this.hdtype = hdtype;
  }
  public  void setSubchannel(Integer subchannel)
  {
    this.subchannel = subchannel;
  }
  public  void setHdname(String hdname)
  {
    this.hdname = hdname;
  }
  public  void setHdphoto(String hdphoto)
  {
    this.hdphoto = hdphoto;
  }
  public  void setPhotourl(String photourl)
  {
    this.photourl = photourl;
  }
  public  void setBegindate(Date begindate)
  {
    this.begindate = begindate;
  }
  public  void setEnddate(Date enddate)
  {
    this.enddate = enddate;
  }
  public  void setLocation(Integer location)
  {
    this.location = location;
  }
  public  void setHddesc(String hddesc)
  {
    this.hddesc = hddesc;
  }
  public  void setAddtime(Date addtime)
  {
    this.addtime = addtime;
  }
  public  void setAddor(String addor)
  {
    this.addor = addor;
  }
  public  void setFlag(Integer flag)
  {
    this.flag = flag;
  }
  public  void setPhotoflag(Integer photoflag)
  {
    this.photoflag = photoflag;
  }
  public  void setIndexflag(Integer indexflag)
  {
    this.indexflag = indexflag;
  }
  public  void setPindaoflag(Integer pindaoflag)
  {
    this.pindaoflag = pindaoflag;
  }
  public  void setHdphoto_android(String hdphoto_android)
  {
    this.hdphoto_android = hdphoto_android;
  }
  public  void setLastupttime(Date lastupttime)
  {
    this.lastupttime = lastupttime;
  }
  public  void setLastuptuser(String lastuptuser)
  {
    this.lastuptuser = lastuptuser;
  }
  public  void setStarthits(Integer starthits)
  {
    this.starthits = starthits;
  }
  public  void setGqhdid(Integer gqhdid)
  {
    this.gqhdid = gqhdid;
  }
}