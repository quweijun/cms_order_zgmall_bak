package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Mobilenumber;

public interface MobilenumberMapper {
    int insert(Mobilenumber record);

    int insertSelective(Mobilenumber record);
}