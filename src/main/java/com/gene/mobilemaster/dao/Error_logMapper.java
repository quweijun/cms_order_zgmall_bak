package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Error_log;

public interface Error_logMapper {
    int insert(Error_log record);

    int insertSelective(Error_log record);
}