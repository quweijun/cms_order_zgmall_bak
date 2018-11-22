package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Message;

public interface MessageMapper {
    int insert(Message record);

    int insertSelective(Message record);
}