package com.zgmall.model.provide;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Id;

public class Provide {
  @Id
  private Integer id;
  private Integer pid;
  private String providename;
  private String address;
  private String telephone;
  private String fax;
  private String linkman;
  private String mobile;
  private String remark;
  private Integer flag;
  private String addtor;
  private Date addtime;
  private String provideid;
  private String qq;
  private String trackingman;
  private String sh_contact;
  private String sh_mobile;
  private String sh_address;
  public Integer getId()
  {
    return this.id;
  }
  public Integer getPid()
  {
    return this.pid;
  }
  public String getProvidename()
  {
    return this.providename;
  }
  public String getAddress()
  {
    return this.address;
  }
  public String getTelephone()
  {
    return this.telephone;
  }
  public String getFax()
  {
    return this.fax;
  }
  public String getLinkman()
  {
    return this.linkman;
  }
  public String getMobile()
  {
    return this.mobile;
  }
  public String getRemark()
  {
    return this.remark;
  }
  public Integer getFlag()
  {
    return this.flag;
  }
  public String getAddtor()
  {
    return this.addtor;
  }
  public Date getAddtime()
  {
    return this.addtime;
  }
  public String getProvideid()
  {
    return this.provideid;
  }
  public String getQq()
  {
    return this.qq;
  }
  public String getTrackingman()
  {
    return this.trackingman;
  }
  public String getSh_contact()
  {
    return this.sh_contact;
  }
  public String getSh_mobile()
  {
    return this.sh_mobile;
  }
  public String getSh_address()
  {
    return this.sh_address;
  }
  public  void setId(Integer id)
  {
    this.id = id;
  }
  public  void setPid(Integer pid)
  {
    this.pid = pid;
  }
  public  void setProvidename(String providename)
  {
    this.providename = providename;
  }
  public  void setAddress(String address)
  {
    this.address = address;
  }
  public  void setTelephone(String telephone)
  {
    this.telephone = telephone;
  }
  public  void setFax(String fax)
  {
    this.fax = fax;
  }
  public  void setLinkman(String linkman)
  {
    this.linkman = linkman;
  }
  public  void setMobile(String mobile)
  {
    this.mobile = mobile;
  }
  public  void setRemark(String remark)
  {
    this.remark = remark;
  }
  public  void setFlag(Integer flag)
  {
    this.flag = flag;
  }
  public  void setAddtor(String addtor)
  {
    this.addtor = addtor;
  }
  public  void setAddtime(Date addtime)
  {
    this.addtime = addtime;
  }
  public  void setProvideid(String provideid)
  {
    this.provideid = provideid;
  }
  public  void setQq(String qq)
  {
    this.qq = qq;
  }
  public  void setTrackingman(String trackingman)
  {
    this.trackingman = trackingman;
  }
  public  void setSh_contact(String sh_contact)
  {
    this.sh_contact = sh_contact;
  }
  public  void setSh_mobile(String sh_mobile)
  {
    this.sh_mobile = sh_mobile;
  }
  public  void setSh_address(String sh_address)
  {
    this.sh_address = sh_address;
  }
}