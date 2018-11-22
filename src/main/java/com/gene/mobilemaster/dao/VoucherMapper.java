package com.gene.mobilemaster.dao;

import com.gene.mobilemaster.model.Voucher;

public interface VoucherMapper {
    int insert(Voucher record);

    int insertSelective(Voucher record);
}