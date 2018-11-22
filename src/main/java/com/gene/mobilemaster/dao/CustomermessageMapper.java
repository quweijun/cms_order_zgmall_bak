package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Customermessage;

public interface CustomermessageMapper {
    int insert(Customermessage record);

    int insertSelective(Customermessage record);
}