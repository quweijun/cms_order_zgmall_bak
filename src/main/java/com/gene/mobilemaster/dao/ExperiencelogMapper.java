package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Experiencelog;

public interface ExperiencelogMapper {
    int insert(Experiencelog record);

    int insertSelective(Experiencelog record);
}