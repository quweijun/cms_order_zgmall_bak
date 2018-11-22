package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Password_log;

public interface Password_logMapper {
    int insert(Password_log record);

    int insertSelective(Password_log record);
}