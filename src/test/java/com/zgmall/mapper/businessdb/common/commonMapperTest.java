package com.zgmall.mapper.businessdb.common;

import com.github.pagehelper.PageHelper;
import com.google.gson.Gson;
import com.zgmall.mapper.businessdb.customer.CustomerMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class commonMapperTest {
    @Autowired
    CustomerMapper customerMapper;
    @Autowired
    CommonMapper commonMapper;
    //@Test
    public void queryById() {
    }
    //@Test
    public void listTables() {
        List<String> list=commonMapper.listTables();
        //System.out.println(new Gson().toJson(list));
        for (int i=0;i<list.size();i++){
            System.out.println("======="+new Gson().toJson(list.get(i))+"=======");
            System.out.println(new Gson().toJson(commonMapper.descTable(list.get(i))));
        }
        //System.out.println(new Gson().toJson(commonMapper.descTable("customer")));
    }

    //@Test
    public void descTable() {
    }
}