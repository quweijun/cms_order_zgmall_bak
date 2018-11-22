package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Customer_temp_mobile;

public interface Customer_temp_mobileMapper {
    int insert(Customer_temp_mobile record);

    int insertSelective(Customer_temp_mobile record);
}