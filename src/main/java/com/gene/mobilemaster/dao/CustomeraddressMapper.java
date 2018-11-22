package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Customeraddress;

public interface CustomeraddressMapper {
    int insert(Customeraddress record);

    int insertSelective(Customeraddress record);
}