package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Usermessage;

public interface UsermessageMapper {
    int insert(Usermessage record);

    int insertSelective(Usermessage record);
}