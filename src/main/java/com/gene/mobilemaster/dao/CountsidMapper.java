package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Countsid;

public interface CountsidMapper {
    int insert(Countsid record);

    int insertSelective(Countsid record);
}