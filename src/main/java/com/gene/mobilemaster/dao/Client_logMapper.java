package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Client_log;

public interface Client_logMapper {
    int insert(Client_log record);

    int insertSelective(Client_log record);
}