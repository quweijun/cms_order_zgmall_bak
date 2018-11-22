package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Forumpost;

public interface ForumpostMapper {
    int insert(Forumpost record);

    int insertSelective(Forumpost record);
}