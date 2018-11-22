package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Sessionmessage;

public interface SessionmessageMapper {
    int insert(Sessionmessage record);

    int insertSelective(Sessionmessage record);
}