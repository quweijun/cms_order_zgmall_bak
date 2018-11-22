package com.zgmall.mapper.businessdb.product;

import com.zgmall.config.mybatis.MyMapper;
import com.zgmall.model.product.JDProductLib;

import com.zgmall.vo.ProductVo;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


@Service("JDProductLibMapper")
public interface JDProductLibMapper extends MyMapper<JDProductLib> {
    List<JDProductLib> query(@Param("searchbrand") String searchbrand,@Param("searchword")  String searchword);
    List<JDProductLib> queryByObj(ProductVo productVo);
    List<Map<String,Object>> zgfl(@Param("fllevel") Integer fllevel,@Param("parentid") Integer parentid);

    @Select("select * from  jd_productlib  order by CPRQ desc limit 0,#{topnum}")
    List<JDProductLib> listTopProduct(Integer topnum);
}