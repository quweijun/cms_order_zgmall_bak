package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Mobileverify;

public interface MobileverifyMapper {
    int insert(Mobileverify record);

    int insertSelective(Mobileverify record);
}