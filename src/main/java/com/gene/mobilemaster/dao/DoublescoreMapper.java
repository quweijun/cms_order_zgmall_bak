package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Doublescore;

public interface DoublescoreMapper {
    int insert(Doublescore record);

    int insertSelective(Doublescore record);
}