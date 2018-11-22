package com.gene.dao;

import com.zgmall.model.product.JDProductLib;

public interface JDProductLibMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JDProductLib record);

    int insertSelective(JDProductLib record);

    JDProductLib selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JDProductLib record);

    int updateByPrimaryKey(JDProductLib record);
}