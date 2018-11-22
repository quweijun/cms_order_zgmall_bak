package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Randomreview;

public interface RandomreviewMapper {
    int insert(Randomreview record);

    int insertSelective(Randomreview record);
}