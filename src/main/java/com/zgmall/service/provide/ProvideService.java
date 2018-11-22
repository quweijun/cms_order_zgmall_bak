package com.zgmall.service.provide;

import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.zgmall.mapper.businessdb.provide.ProvideMapper;
import com.zgmall.model.provide.Provide;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;
import com.zgmall.common.util.mybatisUtil;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
@Service("ProvideService")
public class ProvideService {
    @Autowired
    ProvideMapper provideMapper;
    //@Override
    public Map<String, Object> selectList(Provide provide) {
        Example example = new Example(Provide.class);
        Example.Criteria criteria=example.createCriteria();
        //根据对象的属性值补充过滤条件
        mybatisUtil.generateCriteria(criteria,provide);
        //example.setOrderByClause("id desc");
        Map<String, Object> resultMap = new LinkedHashMap<>();
        List<Provide> provideList = provideMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo<>(provideList);
        resultMap.put("pageInfo", pageInfo);
        return resultMap;
    }

    //@Override
    public void add(Provide provide) {
        provideMapper.insert(provide);
    }

    //@Override
    public void update(Provide provide) {
        //logger.info(new Gson().toJson(provide));
        provideMapper.updateByPrimaryKeySelective(provide);
    }

    //@Override
    public void del(Provide provide) {
        provideMapper.deleteByPrimaryKey(provide);
    }
}
