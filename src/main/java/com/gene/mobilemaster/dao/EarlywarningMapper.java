package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Earlywarning;

public interface EarlywarningMapper {
    int insert(Earlywarning record);

    int insertSelective(Earlywarning record);
}