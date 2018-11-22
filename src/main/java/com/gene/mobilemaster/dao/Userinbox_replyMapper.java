package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Userinbox_reply;

public interface Userinbox_replyMapper {
    int insert(Userinbox_reply record);

    int insertSelective(Userinbox_reply record);
}