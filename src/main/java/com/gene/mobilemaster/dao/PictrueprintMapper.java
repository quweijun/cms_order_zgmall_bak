package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Pictrueprint;

public interface PictrueprintMapper {
    int insert(Pictrueprint record);

    int insertSelective(Pictrueprint record);
}