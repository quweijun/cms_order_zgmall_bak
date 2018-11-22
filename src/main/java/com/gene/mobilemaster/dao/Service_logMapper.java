package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Service_log;

public interface Service_logMapper {
    int insert(Service_log record);

    int insertSelective(Service_log record);
}