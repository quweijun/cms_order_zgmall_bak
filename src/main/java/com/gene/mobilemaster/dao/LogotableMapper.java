package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Logotable;

public interface LogotableMapper {
    int insert(Logotable record);

    int insertSelective(Logotable record);
}