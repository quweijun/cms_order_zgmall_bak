package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Address_log;

public interface Address_logMapper {
    int insert(Address_log record);

    int insertSelective(Address_log record);
}