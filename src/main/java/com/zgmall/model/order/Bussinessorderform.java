package com.zgmall.model.order;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Id;

public class Bussinessorderform {
  @Id
  private String orderid;
  private String channelid;
  private String bussinessid;
  private String bussinessname;
  private String pjcodes;
  private String provider;
  private String pjprovider;
  private long bussinessprice;
  private long provideprice;
  private float tcprice;
  private String bussinesscount;
  private Date submitdate;
  private String ordername;
  private String province;
  private String province2;
  private String city;
  private String city2;
  private String area;
  private String area2;
  private String address;
  private String address2;
  private String orderphone;
  private String backupphone;
  private String mobile;
  private String liuyan;
  private Integer submitflag;
  private Integer orderstate;
  private Integer jifupingtai;
  private Integer payment;
  private Integer payment2;
  private String userid;
  private String postcode;
  private String shipper;
  private String expressid;
  private String hycompany;
  private String areaname;
  private long postamount;
  private long formalities;
  private long backamount;
  private String userip;
  private String kfdesc;
  private String fydesc;
  private Date dwc_time;
  private Date updatetime;
  private Date chulitime;
  private String cuctomerid;
  private Date fhtime;
  private long yjhk;
  private long sjhk;
  private String bankname;
  private Date reimbursement;
  private Integer paymentflag;
  private String orderflag;
  private Integer jifu;
  private String fhaddress;
  private Integer csettleflag;
  private Integer csettleid;
  private String useragent;
  private String pjid;
  private String cus_productid;
  private String jiaqianzp;
  private Integer zengzhi_num;
  private float ssje;
  private String cwbz;
  private String cwqs;
  private Date cwcl;
  private float ysje;
  private String fhuser;
  private String ready;
  private String fahuo;
  private String user_address;
  private String order_mode;
  private String lastuptuserid;
  private Integer isshouhou;
  private String sessionid;
  private String rk_server;
  private String rk_url;
  private String rk_urlparam;
  private String channelsettleflag;
  private String package2;
  private String new_orderid;
  private long weight;
  private float youfei;
  private Integer all_history;
  private Integer true_history;
  private Integer ykcbz;
  private Integer is_export;
  private Date xx_fhtime;
  private Integer iszkyh;
  private float useredpackets;
  private String submittype;
  private String trade_no;
  private Integer issms;
  private String smsreply;
  private Integer isyouhuo;
  private Integer isduizhang;
  private Integer freepost;
  public String getOrderid()
  {
    return this.orderid;
  }
  public String getChannelid()
  {
    return this.channelid;
  }
  public String getBussinessid()
  {
    return this.bussinessid;
  }
  public String getBussinessname()
  {
    return this.bussinessname;
  }
  public String getPjcodes()
  {
    return this.pjcodes;
  }
  public String getProvider()
  {
    return this.provider;
  }
  public String getPjprovider()
  {
    return this.pjprovider;
  }
  public long getBussinessprice()
  {
    return this.bussinessprice;
  }
  public long getProvideprice()
  {
    return this.provideprice;
  }
  public float getTcprice()
  {
    return this.tcprice;
  }
  public String getBussinesscount()
  {
    return this.bussinesscount;
  }
  public Date getSubmitdate()
  {
    return this.submitdate;
  }
  public String getOrdername()
  {
    return this.ordername;
  }
  public String getProvince()
  {
    return this.province;
  }
  public String getProvince2()
  {
    return this.province2;
  }
  public String getCity()
  {
    return this.city;
  }
  public String getCity2()
  {
    return this.city2;
  }
  public String getArea()
  {
    return this.area;
  }
  public String getArea2()
  {
    return this.area2;
  }
  public String getAddress()
  {
    return this.address;
  }
  public String getAddress2()
  {
    return this.address2;
  }
  public String getOrderphone()
  {
    return this.orderphone;
  }
  public String getBackupphone()
  {
    return this.backupphone;
  }
  public String getMobile()
  {
    return this.mobile;
  }
  public String getLiuyan()
  {
    return this.liuyan;
  }
  public Integer getSubmitflag()
  {
    return this.submitflag;
  }
  public Integer getOrderstate()
  {
    return this.orderstate;
  }
  public Integer getJifupingtai()
  {
    return this.jifupingtai;
  }
  public Integer getPayment()
  {
    return this.payment;
  }
  public Integer getPayment2()
  {
    return this.payment2;
  }
  public String getUserid()
  {
    return this.userid;
  }
  public String getPostcode()
  {
    return this.postcode;
  }
  public String getShipper()
  {
    return this.shipper;
  }
  public String getExpressid()
  {
    return this.expressid;
  }
  public String getHycompany()
  {
    return this.hycompany;
  }
  public String getAreaname()
  {
    return this.areaname;
  }
  public long getPostamount()
  {
    return this.postamount;
  }
  public long getFormalities()
  {
    return this.formalities;
  }
  public long getBackamount()
  {
    return this.backamount;
  }
  public String getUserip()
  {
    return this.userip;
  }
  public String getKfdesc()
  {
    return this.kfdesc;
  }
  public String getFydesc()
  {
    return this.fydesc;
  }
  public Date getDwc_time()
  {
    return this.dwc_time;
  }
  public Date getUpdatetime()
  {
    return this.updatetime;
  }
  public Date getChulitime()
  {
    return this.chulitime;
  }
  public String getCuctomerid()
  {
    return this.cuctomerid;
  }
  public Date getFhtime()
  {
    return this.fhtime;
  }
  public long getYjhk()
  {
    return this.yjhk;
  }
  public long getSjhk()
  {
    return this.sjhk;
  }
  public String getBankname()
  {
    return this.bankname;
  }
  public Date getReimbursement()
  {
    return this.reimbursement;
  }
  public Integer getPaymentflag()
  {
    return this.paymentflag;
  }
  public String getOrderflag()
  {
    return this.orderflag;
  }
  public Integer getJifu()
  {
    return this.jifu;
  }
  public String getFhaddress()
  {
    return this.fhaddress;
  }
  public Integer getCsettleflag()
  {
    return this.csettleflag;
  }
  public Integer getCsettleid()
  {
    return this.csettleid;
  }
  public String getUseragent()
  {
    return this.useragent;
  }
  public String getPjid()
  {
    return this.pjid;
  }
  public String getCus_productid()
  {
    return this.cus_productid;
  }
  public String getJiaqianzp()
  {
    return this.jiaqianzp;
  }
  public Integer getZengzhi_num()
  {
    return this.zengzhi_num;
  }
  public float getSsje()
  {
    return this.ssje;
  }
  public String getCwbz()
  {
    return this.cwbz;
  }
  public String getCwqs()
  {
    return this.cwqs;
  }
  public Date getCwcl()
  {
    return this.cwcl;
  }
  public float getYsje()
  {
    return this.ysje;
  }
  public String getFhuser()
  {
    return this.fhuser;
  }
  public String getReady()
  {
    return this.ready;
  }
  public String getFahuo()
  {
    return this.fahuo;
  }
  public String getUser_address()
  {
    return this.user_address;
  }
  public String getOrder_mode()
  {
    return this.order_mode;
  }
  public String getLastuptuserid()
  {
    return this.lastuptuserid;
  }
  public Integer getIsshouhou()
  {
    return this.isshouhou;
  }
  public String getSessionid()
  {
    return this.sessionid;
  }
  public String getRk_server()
  {
    return this.rk_server;
  }
  public String getRk_url()
  {
    return this.rk_url;
  }
  public String getRk_urlparam()
  {
    return this.rk_urlparam;
  }
  public String getChannelsettleflag()
  {
    return this.channelsettleflag;
  }
  public String getPackage2()
  {
    return this.package2;
  }
  public String getNew_orderid()
  {
    return this.new_orderid;
  }
  public long getWeight()
  {
    return this.weight;
  }
  public float getYoufei()
  {
    return this.youfei;
  }
  public Integer getAll_history()
  {
    return this.all_history;
  }
  public Integer getTrue_history()
  {
    return this.true_history;
  }
  public Integer getYkcbz()
  {
    return this.ykcbz;
  }
  public Integer getIs_export()
  {
    return this.is_export;
  }
  public Date getXx_fhtime()
  {
    return this.xx_fhtime;
  }
  public Integer getIszkyh()
  {
    return this.iszkyh;
  }
  public float getUseredpackets()
  {
    return this.useredpackets;
  }
  public String getSubmittype()
  {
    return this.submittype;
  }
  public String getTrade_no()
  {
    return this.trade_no;
  }
  public Integer getIssms()
  {
    return this.issms;
  }
  public String getSmsreply()
  {
    return this.smsreply;
  }
  public Integer getIsyouhuo()
  {
    return this.isyouhuo;
  }
  public Integer getIsduizhang()
  {
    return this.isduizhang;
  }
  public Integer getFreepost()
  {
    return this.freepost;
  }
  public  void setOrderid(String orderid)
  {
    this.orderid = orderid;
  }
  public  void setChannelid(String channelid)
  {
    this.channelid = channelid;
  }
  public  void setBussinessid(String bussinessid)
  {
    this.bussinessid = bussinessid;
  }
  public  void setBussinessname(String bussinessname)
  {
    this.bussinessname = bussinessname;
  }
  public  void setPjcodes(String pjcodes)
  {
    this.pjcodes = pjcodes;
  }
  public  void setProvider(String provider)
  {
    this.provider = provider;
  }
  public  void setPjprovider(String pjprovider)
  {
    this.pjprovider = pjprovider;
  }
  public  void setBussinessprice(long bussinessprice)
  {
    this.bussinessprice = bussinessprice;
  }
  public  void setProvideprice(long provideprice)
  {
    this.provideprice = provideprice;
  }
  public  void setTcprice(float tcprice)
  {
    this.tcprice = tcprice;
  }
  public  void setBussinesscount(String bussinesscount)
  {
    this.bussinesscount = bussinesscount;
  }
  public  void setSubmitdate(Date submitdate)
  {
    this.submitdate = submitdate;
  }
  public  void setOrdername(String ordername)
  {
    this.ordername = ordername;
  }
  public  void setProvince(String province)
  {
    this.province = province;
  }
  public  void setProvince2(String province2)
  {
    this.province2 = province2;
  }
  public  void setCity(String city)
  {
    this.city = city;
  }
  public  void setCity2(String city2)
  {
    this.city2 = city2;
  }
  public  void setArea(String area)
  {
    this.area = area;
  }
  public  void setArea2(String area2)
  {
    this.area2 = area2;
  }
  public  void setAddress(String address)
  {
    this.address = address;
  }
  public  void setAddress2(String address2)
  {
    this.address2 = address2;
  }
  public  void setOrderphone(String orderphone)
  {
    this.orderphone = orderphone;
  }
  public  void setBackupphone(String backupphone)
  {
    this.backupphone = backupphone;
  }
  public  void setMobile(String mobile)
  {
    this.mobile = mobile;
  }
  public  void setLiuyan(String liuyan)
  {
    this.liuyan = liuyan;
  }
  public  void setSubmitflag(Integer submitflag)
  {
    this.submitflag = submitflag;
  }
  public  void setOrderstate(Integer orderstate)
  {
    this.orderstate = orderstate;
  }
  public  void setJifupingtai(Integer jifupingtai)
  {
    this.jifupingtai = jifupingtai;
  }
  public  void setPayment(Integer payment)
  {
    this.payment = payment;
  }
  public  void setPayment2(Integer payment2)
  {
    this.payment2 = payment2;
  }
  public  void setUserid(String userid)
  {
    this.userid = userid;
  }
  public  void setPostcode(String postcode)
  {
    this.postcode = postcode;
  }
  public  void setShipper(String shipper)
  {
    this.shipper = shipper;
  }
  public  void setExpressid(String expressid)
  {
    this.expressid = expressid;
  }
  public  void setHycompany(String hycompany)
  {
    this.hycompany = hycompany;
  }
  public  void setAreaname(String areaname)
  {
    this.areaname = areaname;
  }
  public  void setPostamount(long postamount)
  {
    this.postamount = postamount;
  }
  public  void setFormalities(long formalities)
  {
    this.formalities = formalities;
  }
  public  void setBackamount(long backamount)
  {
    this.backamount = backamount;
  }
  public  void setUserip(String userip)
  {
    this.userip = userip;
  }
  public  void setKfdesc(String kfdesc)
  {
    this.kfdesc = kfdesc;
  }
  public  void setFydesc(String fydesc)
  {
    this.fydesc = fydesc;
  }
  public  void setDwc_time(Date dwc_time)
  {
    this.dwc_time = dwc_time;
  }
  public  void setUpdatetime(Date updatetime)
  {
    this.updatetime = updatetime;
  }
  public  void setChulitime(Date chulitime)
  {
    this.chulitime = chulitime;
  }
  public  void setCuctomerid(String cuctomerid)
  {
    this.cuctomerid = cuctomerid;
  }
  public  void setFhtime(Date fhtime)
  {
    this.fhtime = fhtime;
  }
  public  void setYjhk(long yjhk)
  {
    this.yjhk = yjhk;
  }
  public  void setSjhk(long sjhk)
  {
    this.sjhk = sjhk;
  }
  public  void setBankname(String bankname)
  {
    this.bankname = bankname;
  }
  public  void setReimbursement(Date reimbursement)
  {
    this.reimbursement = reimbursement;
  }
  public  void setPaymentflag(Integer paymentflag)
  {
    this.paymentflag = paymentflag;
  }
  public  void setOrderflag(String orderflag)
  {
    this.orderflag = orderflag;
  }
  public  void setJifu(Integer jifu)
  {
    this.jifu = jifu;
  }
  public  void setFhaddress(String fhaddress)
  {
    this.fhaddress = fhaddress;
  }
  public  void setCsettleflag(Integer csettleflag)
  {
    this.csettleflag = csettleflag;
  }
  public  void setCsettleid(Integer csettleid)
  {
    this.csettleid = csettleid;
  }
  public  void setUseragent(String useragent)
  {
    this.useragent = useragent;
  }
  public  void setPjid(String pjid)
  {
    this.pjid = pjid;
  }
  public  void setCus_productid(String cus_productid)
  {
    this.cus_productid = cus_productid;
  }
  public  void setJiaqianzp(String jiaqianzp)
  {
    this.jiaqianzp = jiaqianzp;
  }
  public  void setZengzhi_num(Integer zengzhi_num)
  {
    this.zengzhi_num = zengzhi_num;
  }
  public  void setSsje(float ssje)
  {
    this.ssje = ssje;
  }
  public  void setCwbz(String cwbz)
  {
    this.cwbz = cwbz;
  }
  public  void setCwqs(String cwqs)
  {
    this.cwqs = cwqs;
  }
  public  void setCwcl(Date cwcl)
  {
    this.cwcl = cwcl;
  }
  public  void setYsje(float ysje)
  {
    this.ysje = ysje;
  }
  public  void setFhuser(String fhuser)
  {
    this.fhuser = fhuser;
  }
  public  void setReady(String ready)
  {
    this.ready = ready;
  }
  public  void setFahuo(String fahuo)
  {
    this.fahuo = fahuo;
  }
  public  void setUser_address(String user_address)
  {
    this.user_address = user_address;
  }
  public  void setOrder_mode(String order_mode)
  {
    this.order_mode = order_mode;
  }
  public  void setLastuptuserid(String lastuptuserid)
  {
    this.lastuptuserid = lastuptuserid;
  }
  public  void setIsshouhou(Integer isshouhou)
  {
    this.isshouhou = isshouhou;
  }
  public  void setSessionid(String sessionid)
  {
    this.sessionid = sessionid;
  }
  public  void setRk_server(String rk_server)
  {
    this.rk_server = rk_server;
  }
  public  void setRk_url(String rk_url)
  {
    this.rk_url = rk_url;
  }
  public  void setRk_urlparam(String rk_urlparam)
  {
    this.rk_urlparam = rk_urlparam;
  }
  public  void setChannelsettleflag(String channelsettleflag)
  {
    this.channelsettleflag = channelsettleflag;
  }
  public  void setPackage2(String package2)
  {
    this.package2 = package2;
  }
  public  void setNew_orderid(String new_orderid)
  {
    this.new_orderid = new_orderid;
  }
  public  void setWeight(long weight)
  {
    this.weight = weight;
  }
  public  void setYoufei(float youfei)
  {
    this.youfei = youfei;
  }
  public  void setAll_history(Integer all_history)
  {
    this.all_history = all_history;
  }
  public  void setTrue_history(Integer true_history)
  {
    this.true_history = true_history;
  }
  public  void setYkcbz(Integer ykcbz)
  {
    this.ykcbz = ykcbz;
  }
  public  void setIs_export(Integer is_export)
  {
    this.is_export = is_export;
  }
  public  void setXx_fhtime(Date xx_fhtime)
  {
    this.xx_fhtime = xx_fhtime;
  }
  public  void setIszkyh(Integer iszkyh)
  {
    this.iszkyh = iszkyh;
  }
  public  void setUseredpackets(float useredpackets)
  {
    this.useredpackets = useredpackets;
  }
  public  void setSubmittype(String submittype)
  {
    this.submittype = submittype;
  }
  public  void setTrade_no(String trade_no)
  {
    this.trade_no = trade_no;
  }
  public  void setIssms(Integer issms)
  {
    this.issms = issms;
  }
  public  void setSmsreply(String smsreply)
  {
    this.smsreply = smsreply;
  }
  public  void setIsyouhuo(Integer isyouhuo)
  {
    this.isyouhuo = isyouhuo;
  }
  public  void setIsduizhang(Integer isduizhang)
  {
    this.isduizhang = isduizhang;
  }
  public  void setFreepost(Integer freepost)
  {
    this.freepost = freepost;
  }
}