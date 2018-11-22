package com.zgmall.mapper.businessdb.customer;

import com.zgmall.model.customer.Score_rule;
import com.zgmall.config.mybatis.MyMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Service("Score_ruleMapper")
public interface Score_ruleMapper  extends MyMapper<Score_rule> {
    //@Select("SELECT * FROM auth_user WHERE user_id=#{userId}")
    /*范例*/
    @Select("select * from score_rule where score_rule_id=#{scoreruleid}")
    Score_rule queryById(String scoreruleid);
}