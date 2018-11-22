package com.gene.mobilemaster.model;

public class Order_alipay {
    private Long id;

    private String alipayno;

    private String orderid;

    private String money;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlipayno() {
        return alipayno;
    }

    public void setAlipayno(String alipayno) {
        this.alipayno = alipayno == null ? null : alipayno.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money == null ? null : money.trim();
    }
}