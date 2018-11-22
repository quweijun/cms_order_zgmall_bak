package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Minfo_log;

public interface Minfo_logMapper {
    int insert(Minfo_log record);

    int insertSelective(Minfo_log record);
}