package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Customer_bak;

public interface Customer_bakMapper {
    int insert(Customer_bak record);

    int insertSelective(Customer_bak record);
}