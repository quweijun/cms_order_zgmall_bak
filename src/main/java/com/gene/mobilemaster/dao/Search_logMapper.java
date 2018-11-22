package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Search_log;

public interface Search_logMapper {
    int insert(Search_log record);

    int insertSelective(Search_log record);
}