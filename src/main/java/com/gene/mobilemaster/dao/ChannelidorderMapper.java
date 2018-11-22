package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Channelidorder;

public interface ChannelidorderMapper {
    int insert(Channelidorder record);

    int insertSelective(Channelidorder record);
}