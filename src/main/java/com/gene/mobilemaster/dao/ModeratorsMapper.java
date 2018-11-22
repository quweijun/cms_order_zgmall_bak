package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Moderators;

public interface ModeratorsMapper {
    int insert(Moderators record);

    int insertSelective(Moderators record);
}