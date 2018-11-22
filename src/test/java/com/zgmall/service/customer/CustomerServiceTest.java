package com.zgmall.service.customer;

import com.github.pagehelper.PageHelper;
import com.google.gson.Gson;
import com.zgmall.common.util.PageUtils;
import com.zgmall.common.util.SpringUtil;
import com.zgmall.mapper.businessdb.common.ProvinceMapper;
import com.zgmall.mapper.businessdb.customer.CustomerMapper;
import com.zgmall.model.common.Province;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zgmall.model.customer.Customer;
import com.zgmall.service.customer.CustomerService;
import com.zgmall.vo.customer.CustomerVo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerServiceTest {
    @Autowired
    CustomerService custService;
    @Autowired
    CustomerMapper customerMapper;
    @Autowired
    ProvinceMapper provinceMapper;
    // @Test
    public void selectCustomerList() {
        CustomerVo cus=new CustomerVo();
        //cus.setUsername("cat");
        PageHelper.startPage(1, PageUtils.PAGE_TWENTY);
        System.out.println("==========="+new Gson().toJson(custService.selectCustomerList(cus)));
    }
   // @Test
    public void listbeans(){
        String[] beans=SpringUtil.getApplicationContext().getBeanDefinitionNames();
        for(int i=0;i<beans.length;i++){
            System.out.println(beans[i].toString());
        }
    }
    @Test
    public void updateCustomer(){
        Customer customer=new Customer();
        customer.setCustomerid((long)1015);
        customer.setCustomername("test");
        System.out.println(customerMapper.updateByPrimaryKeySelective(customer));
    }
    //@Test
    public void updateProvince(){
        Province province=new Province();
        province.setId(1);
        province.setFlag(0);
        System.out.println(provinceMapper.updateByPrimaryKeySelective(province));

    }

}