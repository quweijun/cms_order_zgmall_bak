package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Valid_customer;

public interface Valid_customerMapper {
    int insert(Valid_customer record);

    int insertSelective(Valid_customer record);
}