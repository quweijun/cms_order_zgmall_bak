package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.City;

public interface CityMapper {
    int insert(City record);

    int insertSelective(City record);
}