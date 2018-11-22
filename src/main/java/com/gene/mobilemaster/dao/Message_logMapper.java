package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Message_log;

public interface Message_logMapper {
    int insert(Message_log record);

    int insertSelective(Message_log record);
}