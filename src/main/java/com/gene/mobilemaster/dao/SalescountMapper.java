package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Salescount;

public interface SalescountMapper {
    int insert(Salescount record);

    int insertSelective(Salescount record);
}