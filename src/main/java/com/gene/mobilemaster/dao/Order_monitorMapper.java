package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Order_monitor;

public interface Order_monitorMapper {
    int insert(Order_monitor record);

    int insertSelective(Order_monitor record);
}