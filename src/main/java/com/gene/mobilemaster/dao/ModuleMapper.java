package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Module;

public interface ModuleMapper {
    int insert(Module record);

    int insertSelective(Module record);
}