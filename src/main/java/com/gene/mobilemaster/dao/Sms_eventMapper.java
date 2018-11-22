package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Sms_event;

public interface Sms_eventMapper {
    int insert(Sms_event record);

    int insertSelective(Sms_event record);
}