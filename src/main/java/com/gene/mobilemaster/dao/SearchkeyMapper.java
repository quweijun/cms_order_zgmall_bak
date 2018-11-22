package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Searchkey;

public interface SearchkeyMapper {
    int insert(Searchkey record);

    int insertSelective(Searchkey record);
}