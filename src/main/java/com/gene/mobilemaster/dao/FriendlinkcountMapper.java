package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Friendlinkcount;

public interface FriendlinkcountMapper {
    int insert(Friendlinkcount record);

    int insertSelective(Friendlinkcount record);
}