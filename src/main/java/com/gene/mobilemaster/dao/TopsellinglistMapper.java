package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Topsellinglist;

public interface TopsellinglistMapper {
    int insert(Topsellinglist record);

    int insertSelective(Topsellinglist record);
}