package com.zgmall.mapper.businessdb.product;
import com.zgmall.model.product.Bigtype;
import com.zgmall.config.mybatis.MyMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;
@Service("BigtypeMapper")
public interface BigtypeMapper extends MyMapper<Bigtype> {
}
