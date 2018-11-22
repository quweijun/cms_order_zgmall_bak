package com.zgmall.mapper.businessdb.bussiness;
import com.zgmall.model.bussiness.Hdtable;
import com.zgmall.config.mybatis.MyMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;
@Service("HdtableMapper")
public interface HdtableMapper extends MyMapper<Hdtable> {
}
