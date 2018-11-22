package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Channelnews;

public interface ChannelnewsMapper {
    int insert(Channelnews record);

    int insertSelective(Channelnews record);
}