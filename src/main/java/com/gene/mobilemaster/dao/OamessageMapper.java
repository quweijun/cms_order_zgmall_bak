package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Oamessage;

public interface OamessageMapper {
    int insert(Oamessage record);

    int insertSelective(Oamessage record);
}