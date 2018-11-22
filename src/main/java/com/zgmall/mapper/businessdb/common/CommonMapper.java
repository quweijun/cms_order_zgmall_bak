package com.zgmall.mapper.businessdb.common;

import com.zgmall.config.mybatis.MyMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import com.zgmall.model.customer.Score_rule;
import com.zgmall.model.common.BaseModel;

import java.util.List;
import java.util.Map;

@Service("CommonMapper")
public interface CommonMapper extends MyMapper<BaseModel> {

    @Select("select * from score_rule where score_rule_id=#{scoreruleid}")
    Score_rule queryById(String scoreruleid);
    @Select("show tables")
    List<String> listTables();
    //@Select("desc #{tablename}")
    @Select("select column_name field,data_type type,is_nullable isnull,column_default defaultvalue,column_key iskey,column_comment comment from information_schema.columns where table_schema = 'mobilemaster'  and table_name = #{tablename}")
    //@Results(value={@Result(property = "isnull", column = "null"),@Result(property = "defaultvalue", column = "default")}) //
    List<BaseModel> descTable(@Param("tablename") String tablename);
}
