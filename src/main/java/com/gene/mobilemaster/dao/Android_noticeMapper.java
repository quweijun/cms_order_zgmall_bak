package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Android_notice;

public interface Android_noticeMapper {
    int insert(Android_notice record);

    int insertSelective(Android_notice record);
}