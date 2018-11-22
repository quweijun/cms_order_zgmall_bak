package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Mobile_check_log;

public interface Mobile_check_logMapper {
    int insert(Mobile_check_log record);

    int insertSelective(Mobile_check_log record);
}