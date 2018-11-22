package com.zgmall.model.product;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Id;

public class Product_pv_shopcat_order {
  @Id
  private Integer id;
  private Date countdate;
  private String productid;
  private Integer visitcount;
  private Integer inshopcatnum;
  private Integer allorder;
  private Integer ensureorder;
  private float ensuremoney;
  private Integer channelcount;
  public Integer getId()
  {
    return this.id;
  }
  public Date getCountdate()
  {
    return this.countdate;
  }
  public String getProductid()
  {
    return this.productid;
  }
  public Integer getVisitcount()
  {
    return this.visitcount;
  }
  public Integer getInshopcatnum()
  {
    return this.inshopcatnum;
  }
  public Integer getAllorder()
  {
    return this.allorder;
  }
  public Integer getEnsureorder()
  {
    return this.ensureorder;
  }
  public float getEnsuremoney()
  {
    return this.ensuremoney;
  }
  public Integer getChannelcount()
  {
    return this.channelcount;
  }
  public  void setId(Integer id)
  {
    this.id = id;
  }
  public  void setCountdate(Date countdate)
  {
    this.countdate = countdate;
  }
  public  void setProductid(String productid)
  {
    this.productid = productid;
  }
  public  void setVisitcount(Integer visitcount)
  {
    this.visitcount = visitcount;
  }
  public  void setInshopcatnum(Integer inshopcatnum)
  {
    this.inshopcatnum = inshopcatnum;
  }
  public  void setAllorder(Integer allorder)
  {
    this.allorder = allorder;
  }
  public  void setEnsureorder(Integer ensureorder)
  {
    this.ensureorder = ensureorder;
  }
  public  void setEnsuremoney(float ensuremoney)
  {
    this.ensuremoney = ensuremoney;
  }
  public  void setChannelcount(Integer channelcount)
  {
    this.channelcount = channelcount;
  }
}