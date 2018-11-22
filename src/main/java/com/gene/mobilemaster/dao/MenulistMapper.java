package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Menulist;

public interface MenulistMapper {
    int insert(Menulist record);

    int insertSelective(Menulist record);
}