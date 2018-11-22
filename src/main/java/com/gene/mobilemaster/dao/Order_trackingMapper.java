package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Order_tracking;

public interface Order_trackingMapper {
    int insert(Order_tracking record);

    int insertSelective(Order_tracking record);
}