package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Customer_c_mobile;

public interface Customer_c_mobileMapper {
    int insert(Customer_c_mobile record);

    int insertSelective(Customer_c_mobile record);
}