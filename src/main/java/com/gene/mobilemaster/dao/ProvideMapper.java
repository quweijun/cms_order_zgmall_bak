package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Provide;

public interface ProvideMapper {
    int insert(Provide record);

    int insertSelective(Provide record);
}