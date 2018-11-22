package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Customer_tracking;

public interface Customer_trackingMapper {
    int insert(Customer_tracking record);

    int insertSelective(Customer_tracking record);
}