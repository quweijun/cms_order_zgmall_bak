package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Statechangelog;

public interface StatechangelogMapper {
    int insert(Statechangelog record);

    int insertSelective(Statechangelog record);
}