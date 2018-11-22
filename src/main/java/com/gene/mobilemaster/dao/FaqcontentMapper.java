package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Faqcontent;

public interface FaqcontentMapper {
    int insert(Faqcontent record);

    int insertSelective(Faqcontent record);
}