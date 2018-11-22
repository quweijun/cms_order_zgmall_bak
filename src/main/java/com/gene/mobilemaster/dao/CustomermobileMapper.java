package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Customermobile;

public interface CustomermobileMapper {
    int insert(Customermobile record);

    int insertSelective(Customermobile record);
}