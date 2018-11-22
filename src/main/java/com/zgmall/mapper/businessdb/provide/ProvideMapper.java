package com.zgmall.mapper.businessdb.provide;
import com.zgmall.model.provide.Provide;
import com.zgmall.config.mybatis.MyMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;
@Service("ProvideMapper")
public interface ProvideMapper extends MyMapper<Provide> {
}
