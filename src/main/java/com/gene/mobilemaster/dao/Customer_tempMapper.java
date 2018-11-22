package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Customer_temp;

public interface Customer_tempMapper {
    int insert(Customer_temp record);

    int insertSelective(Customer_temp record);
}