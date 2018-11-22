package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Customeroperation;

public interface CustomeroperationMapper {
    int insert(Customeroperation record);

    int insertSelective(Customeroperation record);
}