package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Score_log;

public interface Score_logMapper {
    int insert(Score_log record);

    int insertSelective(Score_log record);
}