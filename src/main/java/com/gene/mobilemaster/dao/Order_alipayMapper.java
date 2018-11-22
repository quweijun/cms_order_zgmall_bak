package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Order_alipay;

public interface Order_alipayMapper {
    int insert(Order_alipay record);

    int insertSelective(Order_alipay record);
}