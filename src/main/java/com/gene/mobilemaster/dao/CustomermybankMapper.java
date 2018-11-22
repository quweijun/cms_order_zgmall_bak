package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Customermybank;

public interface CustomermybankMapper {
    int insert(Customermybank record);

    int insertSelective(Customermybank record);
}