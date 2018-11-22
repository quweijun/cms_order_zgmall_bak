package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Taocan;

public interface TaocanMapper {
    int insert(Taocan record);

    int insertSelective(Taocan record);
}