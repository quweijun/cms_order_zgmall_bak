package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Blacklist;

public interface BlacklistMapper {
    int insert(Blacklist record);

    int insertSelective(Blacklist record);
}