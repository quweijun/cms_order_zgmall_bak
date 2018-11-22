package com.zgmall.service.customer.impl;

import com.github.pagehelper.PageInfo;
import com.zgmall.base.util.CopyObject;
import com.zgmall.common.util.mybatisUtil;
import com.zgmall.mapper.businessdb.customer.CustomerMapper;
import com.zgmall.model.customer.Customer;
import com.zgmall.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
@Service("CustomerService")
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerMapper customerMapper;
    @Override
    public Map<String, Object> selectCustomerList(Customer customer) {

        Example example = new Example(Customer.class);
        Example.Criteria criteria=example.createCriteria();
        //根据对象的属性值补充过滤条件
        mybatisUtil.generateCriteria(criteria,customer);
//        if (customer.getCustomerid()!=null&& !customer.getCustomerid().equals("")) criteria.andEqualTo("customerid",customer.getCustomerid());
//        if (customer.getUsername()!=null&& !customer.getUsername().equals("")) criteria.andLike("username","%"+customer.getUsername()+"%");
//        if (customer.getCustomername()!=null&& !customer.getCustomername().equals("")) criteria.andLike("customername","%"+customer.getCustomername()+"%");
//        if (customer.getCustomermobile()!=null&& !customer.getCustomermobile().equals("")) criteria.andLike("customermobile",customer.getCustomermobile()+"%");
        example.setOrderByClause("customerid desc");

        System.out.println("1111=============================");
        Map<String, Object> resultMap = new LinkedHashMap<>();
        List<Customer> customerList = customerMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo<>(customerList);
        resultMap.put("pageInfo", pageInfo);
        return resultMap;
    }

    @Override
    public void add(Customer customer) {

    }

    @Override
    public void update(Customer customer) {

    }

    @Override
    public void del(String uuid) {

    }
}
