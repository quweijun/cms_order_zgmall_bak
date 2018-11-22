package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Treelist;

public interface TreelistMapper {
    int insert(Treelist record);

    int insertSelective(Treelist record);
}