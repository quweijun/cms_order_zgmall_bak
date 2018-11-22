package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Community_customer;

public interface Community_customerMapper {
    int insert(Community_customer record);

    int insertSelective(Community_customer record);
}