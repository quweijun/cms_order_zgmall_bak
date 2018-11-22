package com.zgmall.service.customer.impl;

import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.zgmall.base.util.CopyObject;
import com.zgmall.controller.customer.CustomerController;
import com.zgmall.mapper.businessdb.customer.Score_ruleMapper;
import com.zgmall.model.customer.Customer;
import com.zgmall.model.customer.Score_rule;
import com.zgmall.service.customer.ScoreRuleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
@Service("ScoreRuleService")
public class ScoreRuleServiceImpl implements ScoreRuleService {
    private static Logger logger = LoggerFactory.getLogger(ScoreRuleService.class);
        @Autowired
        Score_ruleMapper Score_ruleMapper;
        @Override
        public Map<String, Object> selectScoreRuleList(Score_rule score_rule) {
            Example example = new Example(Score_rule.class);
            Example.Criteria criteria=example.createCriteria();
            if (score_rule.getScoreRuleId()>0) criteria.andEqualTo("scoreRuleId",score_rule.getScoreRuleId());
            //example.setOrderByClause("customerid desc");
            Map<String, Object> resultMap = new LinkedHashMap<>();
            List<Score_rule> customerList = Score_ruleMapper.selectByExample(example);
            PageInfo pageInfo = new PageInfo<>(customerList);
            resultMap.put("pageInfo", pageInfo);
            return resultMap;
    }

    @Override
    public void add(Score_rule score_rule) {
        Score_ruleMapper.insert(score_rule);
    }

    @Override
    public void update(Score_rule score_rule) {
        //logger.info(new Gson().toJson(score_rule));
        Score_ruleMapper.updateByPrimaryKeySelective(score_rule);
    }

    @Override
    public void del(Score_rule score_rule) {
        Score_ruleMapper.deleteByPrimaryKey(score_rule);
    }
}
