package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Help_info;

public interface Help_infoMapper {
    int insert(Help_info record);

    int insertSelective(Help_info record);
}