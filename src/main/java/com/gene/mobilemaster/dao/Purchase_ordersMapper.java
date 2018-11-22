package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Purchase_orders;

public interface Purchase_ordersMapper {
    int insert(Purchase_orders record);

    int insertSelective(Purchase_orders record);
}