package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Urllist;

public interface UrllistMapper {
    int insert(Urllist record);

    int insertSelective(Urllist record);
}