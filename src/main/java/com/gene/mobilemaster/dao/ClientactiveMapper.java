package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Clientactive;

public interface ClientactiveMapper {
    int insert(Clientactive record);

    int insertSelective(Clientactive record);
}