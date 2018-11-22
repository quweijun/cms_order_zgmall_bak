package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Useroutbox;

public interface UseroutboxMapper {
    int insert(Useroutbox record);

    int insertSelective(Useroutbox record);
}