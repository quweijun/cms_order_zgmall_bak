package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Score_total;

public interface Score_totalMapper {
    int insert(Score_total record);

    int insertSelective(Score_total record);
}