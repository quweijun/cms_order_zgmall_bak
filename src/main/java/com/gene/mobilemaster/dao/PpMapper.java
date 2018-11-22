package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Pp;

public interface PpMapper {
    int insert(Pp record);

    int insertSelective(Pp record);
}