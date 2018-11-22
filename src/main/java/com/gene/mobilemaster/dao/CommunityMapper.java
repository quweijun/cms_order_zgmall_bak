package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Community;

public interface CommunityMapper {
    int insert(Community record);

    int insertSelective(Community record);
}