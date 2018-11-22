package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Community_log;

public interface Community_logMapper {
    int insert(Community_log record);

    int insertSelective(Community_log record);
}