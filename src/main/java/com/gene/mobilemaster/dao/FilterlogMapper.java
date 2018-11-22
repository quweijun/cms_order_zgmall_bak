package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Filterlog;

public interface FilterlogMapper {
    int insert(Filterlog record);

    int insertSelective(Filterlog record);
}