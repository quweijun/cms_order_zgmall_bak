package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Clientconfig;

public interface ClientconfigMapper {
    int insert(Clientconfig record);

    int insertSelective(Clientconfig record);
}