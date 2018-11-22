package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Barcodeprintlog;

public interface BarcodeprintlogMapper {
    int insert(Barcodeprintlog record);

    int insertSelective(Barcodeprintlog record);
}