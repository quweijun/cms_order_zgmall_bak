package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Down_info;

public interface Down_infoMapper {
    int insert(Down_info record);

    int insertSelective(Down_info record);
}