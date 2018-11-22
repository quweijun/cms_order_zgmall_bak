package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Send_note;

public interface Send_noteMapper {
    int insert(Send_note record);

    int insertSelective(Send_note record);
}