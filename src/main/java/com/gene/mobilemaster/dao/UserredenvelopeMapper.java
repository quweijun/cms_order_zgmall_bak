package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Userredenvelope;

public interface UserredenvelopeMapper {
    int insert(Userredenvelope record);

    int insertSelective(Userredenvelope record);
}