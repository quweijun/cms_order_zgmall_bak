package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Inspectors;

public interface InspectorsMapper {
    int insert(Inspectors record);

    int insertSelective(Inspectors record);
}