package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Order_error;

public interface Order_errorMapper {
    int insert(Order_error record);

    int insertSelective(Order_error record);
}