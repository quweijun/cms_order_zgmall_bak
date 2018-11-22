package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Link_count;

public interface Link_countMapper {
    int insert(Link_count record);

    int insertSelective(Link_count record);
}