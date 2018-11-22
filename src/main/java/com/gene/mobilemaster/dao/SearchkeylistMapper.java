package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Searchkeylist;

public interface SearchkeylistMapper {
    int insert(Searchkeylist record);

    int insertSelective(Searchkeylist record);
}