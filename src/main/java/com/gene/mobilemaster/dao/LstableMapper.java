package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Lstable;

public interface LstableMapper {
    int insert(Lstable record);

    int insertSelective(Lstable record);
}