package com.zgmall.service.order;

import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.zgmall.mapper.businessdb.order.BussinessorderformMapper;
import com.zgmall.model.order.Bussinessorderform;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;
import com.zgmall.common.util.mybatisUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
@Service("BussinessorderformService")
public class BussinessorderformService {
    private static Logger logger = LoggerFactory.getLogger(BussinessorderformService.class);
    @Autowired
    BussinessorderformMapper bussinessorderformMapper;
        //@Override
    public Map<String, Object> selectList(Bussinessorderform bussinessorderform) {
        Example example = new Example(Bussinessorderform.class);
        Example.Criteria criteria=example.createCriteria();
        //根据对象的属性值补充过滤条件
        mybatisUtil.generateCriteria(criteria,bussinessorderform);
        //example.setOrderByClause("id desc");
        Map<String, Object> resultMap = new LinkedHashMap<>();
        List<Bussinessorderform> bussinessorderformList = bussinessorderformMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo<>(bussinessorderformList);
        resultMap.put("pageInfo", pageInfo);
        return resultMap;
    }

    //@Override
    public void add(Bussinessorderform bussinessorderform) {
        bussinessorderformMapper.insert(bussinessorderform);
    }

    //@Override
    public void update(Bussinessorderform bussinessorderform) {
        bussinessorderformMapper.updateByPrimaryKeySelective(bussinessorderform);
    }

    //@Override
    public void del(Bussinessorderform bussinessorderform) {
        bussinessorderformMapper.deleteByPrimaryKey(bussinessorderform);
    }
}
