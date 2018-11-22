package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Clientlist;

public interface ClientlistMapper {
    int insert(Clientlist record);

    int insertSelective(Clientlist record);
}