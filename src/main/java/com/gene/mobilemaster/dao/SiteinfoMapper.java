package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Siteinfo;

public interface SiteinfoMapper {
    int insert(Siteinfo record);

    int insertSelective(Siteinfo record);
}