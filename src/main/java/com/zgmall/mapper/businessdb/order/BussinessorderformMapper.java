package com.zgmall.mapper.businessdb.order;
import com.zgmall.model.order.Bussinessorderform;
import com.zgmall.config.mybatis.MyMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;
@Service("BussinessorderformMapper")
public interface BussinessorderformMapper extends MyMapper<Bussinessorderform> {
}
