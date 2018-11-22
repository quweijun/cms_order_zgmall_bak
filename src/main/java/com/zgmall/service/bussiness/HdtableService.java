package com.zgmall.service.bussiness;

import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.zgmall.mapper.businessdb.bussiness.HdtableMapper;
import com.zgmall.model.bussiness.Hdtable;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;
import com.zgmall.common.util.mybatisUtil;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
@Service("HdtableService")
public class HdtableService {
    @Autowired
    HdtableMapper hdtableMapper;
        //@Override
    public Map<String, Object> selectList(Hdtable hdtable) {
        Example example = new Example(Hdtable.class);
        Example.Criteria criteria=example.createCriteria();
        //根据对象的属性值补充过滤条件
        mybatisUtil.generateCriteria(criteria,hdtable);
        //example.setOrderByClause("id desc");
        Map<String, Object> resultMap = new LinkedHashMap<>();
        List<Hdtable> hdtableList = hdtableMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo<>(hdtableList);
        resultMap.put("pageInfo", pageInfo);
        return resultMap;
    }

    //@Override
    public void add(Hdtable hdtable) {
        hdtableMapper.insert(hdtable);
    }

    //@Override
    public void update(Hdtable hdtable) {
        //logger.info(new Gson().toJson(hdtable));
        hdtableMapper.updateByPrimaryKeySelective(hdtable);
    }

    //@Override
    public void del(Hdtable hdtable) {
        hdtableMapper.deleteByPrimaryKey(hdtable);
    }
}
