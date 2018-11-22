package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Userinbox;

public interface UserinboxMapper {
    int insert(Userinbox record);

    int insertSelective(Userinbox record);
}