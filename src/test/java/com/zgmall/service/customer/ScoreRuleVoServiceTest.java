package com.zgmall.service.customer;

import com.github.pagehelper.PageHelper;
import com.google.gson.Gson;
import com.zgmall.common.util.PageUtils;
import com.zgmall.common.util.SpringUtil;

import com.zgmall.controller.customer.CustomerController;
import com.zgmall.mapper.businessdb.customer.Score_ruleMapper;
import com.zgmall.model.customer.Score_rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import com.zgmall.vo.customer.ScoreRuleVo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ScoreRuleVoServiceTest {
    private static Logger logger = LoggerFactory.getLogger(CustomerController.class);
    @Autowired
    ScoreRuleService scoreRuleService;
    @Autowired
    Score_ruleMapper score_ruleMapper;

    //@Test
    public void selectScoreRuleList() {
        ScoreRuleVo scoreRuleVo=new ScoreRuleVo();
        PageHelper.startPage(1, PageUtils.PAGE_TWENTY);
        System.out.println("==========="+new Gson().toJson(scoreRuleService.selectScoreRuleList(scoreRuleVo)));
    }
    //@Test
    public void updateScoreRule(){
        Score_rule r1=new Score_rule();
        r1.setScoreRuleId(1);
        r1.setScore(30);

        logger.info(new Gson().toJson(r1));

        scoreRuleService.update(r1);
    }
    @Test
    public void queryById(){
        logger.info(new Gson().toJson(score_ruleMapper.queryById("10")));

    }
}