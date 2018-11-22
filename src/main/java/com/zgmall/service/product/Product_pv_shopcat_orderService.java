package com.zgmall.service.product;

import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.zgmall.mapper.businessdb.product.Product_pv_shopcat_orderMapper;
import com.zgmall.model.product.Product_pv_shopcat_order;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;
import com.zgmall.common.util.mybatisUtil;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
@Service("Product_pv_shopcat_orderService")
public class Product_pv_shopcat_orderService {
    @Autowired
    Product_pv_shopcat_orderMapper product_pv_shopcat_orderMapper;
        //@Override
    public Map<String, Object> selectList(Product_pv_shopcat_order product_pv_shopcat_order) {
        Example example = new Example(Product_pv_shopcat_order.class);
        Example.Criteria criteria=example.createCriteria();
        //根据对象的属性值补充过滤条件
        mybatisUtil.generateCriteria(criteria,product_pv_shopcat_order);
        //example.setOrderByClause("id desc");
        Map<String, Object> resultMap = new LinkedHashMap<>();
        List<Product_pv_shopcat_order> product_pv_shopcat_orderList = product_pv_shopcat_orderMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo<>(product_pv_shopcat_orderList);
        resultMap.put("pageInfo", pageInfo);
        return resultMap;
    }

    //@Override
    public void add(Product_pv_shopcat_order product_pv_shopcat_order) {
        product_pv_shopcat_orderMapper.insert(product_pv_shopcat_order);
    }

    //@Override
    public void update(Product_pv_shopcat_order product_pv_shopcat_order) {
        //logger.info(new Gson().toJson(product_pv_shopcat_order));
        product_pv_shopcat_orderMapper.updateByPrimaryKeySelective(product_pv_shopcat_order);
    }

    //@Override
    public void del(Product_pv_shopcat_order product_pv_shopcat_order) {
        product_pv_shopcat_orderMapper.deleteByPrimaryKey(product_pv_shopcat_order);
    }
}
