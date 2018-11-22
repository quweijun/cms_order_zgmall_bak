package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Filtertable;

public interface FiltertableMapper {
    int insert(Filtertable record);

    int insertSelective(Filtertable record);
}