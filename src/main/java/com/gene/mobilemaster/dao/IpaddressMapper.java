package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Ipaddress;

public interface IpaddressMapper {
    int insert(Ipaddress record);

    int insertSelective(Ipaddress record);
}