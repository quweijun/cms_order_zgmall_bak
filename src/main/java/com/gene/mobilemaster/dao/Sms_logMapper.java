package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Sms_log;

public interface Sms_logMapper {
    int insert(Sms_log record);

    int insertSelective(Sms_log record);
}