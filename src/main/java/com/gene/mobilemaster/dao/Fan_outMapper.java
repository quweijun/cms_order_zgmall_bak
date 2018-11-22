package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Fan_out;

public interface Fan_outMapper {
    int insert(Fan_out record);

    int insertSelective(Fan_out record);
}