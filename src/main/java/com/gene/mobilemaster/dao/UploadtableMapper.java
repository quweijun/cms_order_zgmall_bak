package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Uploadtable;

public interface UploadtableMapper {
    int insert(Uploadtable record);

    int insertSelective(Uploadtable record);
}