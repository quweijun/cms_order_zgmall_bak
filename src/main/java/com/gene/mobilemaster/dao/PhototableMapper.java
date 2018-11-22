package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Phototable;

public interface PhototableMapper {
    int insert(Phototable record);

    int insertSelective(Phototable record);
}