package com.zgmall.mapper.businessdb.customer;

import com.zgmall.config.mybatis.MyMapper;
import com.zgmall.model.customer.Customer;
import org.springframework.stereotype.Service;

@Service("CustomerMapper")
public interface CustomerMapper extends MyMapper<Customer> {
}