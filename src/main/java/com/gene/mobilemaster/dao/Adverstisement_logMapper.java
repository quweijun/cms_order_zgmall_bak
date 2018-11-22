package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Adverstisement_log;

public interface Adverstisement_logMapper {
    int insert(Adverstisement_log record);

    int insertSelective(Adverstisement_log record);
}