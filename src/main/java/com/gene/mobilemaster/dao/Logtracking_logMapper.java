package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Logtracking_log;

public interface Logtracking_logMapper {
    int insert(Logtracking_log record);

    int insertSelective(Logtracking_log record);
}