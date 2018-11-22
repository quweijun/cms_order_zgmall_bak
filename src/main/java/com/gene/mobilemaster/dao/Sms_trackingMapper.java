package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Sms_tracking;

public interface Sms_trackingMapper {
    int insert(Sms_tracking record);

    int insertSelective(Sms_tracking record);
}