package com.gene.mapper.business;

import com.gene.mobilemaster.model.Score_rule;
import com.gene.model.baseModel;
import com.gene.config.mybatis.MyMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.List;

@Service("CommonMapper")
public interface commonMapper extends MyMapper<baseModel> {

    @Select("select * from score_rule where score_rule_id=#{scoreruleid}")
    Score_rule queryById(String scoreruleid);
    @Select("show tables")
    List<String> listTables();
    @Select("desc #{tablename}")
    List<String> descTable();
}
