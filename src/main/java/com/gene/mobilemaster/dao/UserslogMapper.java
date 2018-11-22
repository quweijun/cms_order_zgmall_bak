package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Userslog;

public interface UserslogMapper {
    int insert(Userslog record);

    int insertSelective(Userslog record);
}