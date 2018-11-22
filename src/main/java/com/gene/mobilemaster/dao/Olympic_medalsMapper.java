package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Olympic_medals;

public interface Olympic_medalsMapper {
    int insert(Olympic_medals record);

    int insertSelective(Olympic_medals record);
}