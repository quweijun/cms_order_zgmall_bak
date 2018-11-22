package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Catchrate;

public interface CatchrateMapper {
    int insert(Catchrate record);

    int insertSelective(Catchrate record);
}