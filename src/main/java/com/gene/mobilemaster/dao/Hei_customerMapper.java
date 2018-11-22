package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Hei_customer;

public interface Hei_customerMapper {
    int insert(Hei_customer record);

    int insertSelective(Hei_customer record);
}