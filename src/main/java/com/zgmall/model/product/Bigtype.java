package com.zgmall.model.product;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Id;

public class Bigtype {
  private Integer id;
  private String typename;
  private Integer flag;
  private Integer xhs;
  private String bgimg;
  private String bigcss;
  private Integer isshow;
  private String displayname;
  public Integer getId()
  {
    return this.id;
  }
  public String getTypename()
  {
    return this.typename;
  }
  public Integer getFlag()
  {
    return this.flag;
  }
  public Integer getXhs()
  {
    return this.xhs;
  }
  public String getBgimg()
  {
    return this.bgimg;
  }
  public String getBigcss()
  {
    return this.bigcss;
  }
  public Integer getIsshow()
  {
    return this.isshow;
  }
  public String getDisplayname()
  {
    return this.displayname;
  }
  public  void setId(Integer id)
  {
    this.id = id;
  }
  public  void setTypename(String typename)
  {
    this.typename = typename;
  }
  public  void setFlag(Integer flag)
  {
    this.flag = flag;
  }
  public  void setXhs(Integer xhs)
  {
    this.xhs = xhs;
  }
  public  void setBgimg(String bgimg)
  {
    this.bgimg = bgimg;
  }
  public  void setBigcss(String bigcss)
  {
    this.bigcss = bigcss;
  }
  public  void setIsshow(Integer isshow)
  {
    this.isshow = isshow;
  }
  public  void setDisplayname(String displayname)
  {
    this.displayname = displayname;
  }
}