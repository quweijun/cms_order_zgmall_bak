package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Coustomer_log;

public interface Coustomer_logMapper {
    int insert(Coustomer_log record);

    int insertSelective(Coustomer_log record);
}