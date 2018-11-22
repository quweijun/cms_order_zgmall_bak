package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Link_log;

public interface Link_logMapper {
    int insert(Link_log record);

    int insertSelective(Link_log record);
}