package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Customer_order_count;

public interface Customer_order_countMapper {
    int insert(Customer_order_count record);

    int insertSelective(Customer_order_count record);
}