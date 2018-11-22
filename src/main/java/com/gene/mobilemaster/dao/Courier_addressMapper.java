package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Courier_address;

public interface Courier_addressMapper {
    int insert(Courier_address record);

    int insertSelective(Courier_address record);
}