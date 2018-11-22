package com.zgmall.service.customer;

import com.zgmall.model.customer.Customer;

import java.util.Map;

public interface CustomerService {
    Map<String, Object> selectCustomerList(Customer customer);

    void add(Customer customer);

    void update(Customer customer);

    void del(String uuid);
}
