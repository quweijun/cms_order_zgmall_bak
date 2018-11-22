package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Customer;

public interface CustomerMapper {
    int insert(Customer record);

    int insertSelective(Customer record);
}