package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Friendlink;

public interface FriendlinkMapper {
    int insert(Friendlink record);

    int insertSelective(Friendlink record);
}