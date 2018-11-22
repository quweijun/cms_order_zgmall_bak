package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Customer_del;

public interface Customer_delMapper {
    int insert(Customer_del record);

    int insertSelective(Customer_del record);
}