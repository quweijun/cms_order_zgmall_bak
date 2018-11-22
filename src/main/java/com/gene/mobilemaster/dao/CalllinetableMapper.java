package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Calllinetable;

public interface CalllinetableMapper {
    int insert(Calllinetable record);

    int insertSelective(Calllinetable record);
}