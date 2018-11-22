package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Communitydictionary;

public interface CommunitydictionaryMapper {
    int insert(Communitydictionary record);

    int insertSelective(Communitydictionary record);
}