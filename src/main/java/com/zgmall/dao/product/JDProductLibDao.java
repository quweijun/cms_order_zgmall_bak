package com.zgmall.dao.product;

import com.zgmall.model.product.JDProductLib;
import com.zgmall.vo.ProductVo;

import java.util.List;
import java.util.Map;

public interface JDProductLibDao {
    void add(List<JDProductLib> jdProductLibList);

    void del(JDProductLib jdProductLib);
    List<JDProductLib> selectProductAll();

    void update(JDProductLib jdProductLib);

    List<JDProductLib> selectProduct(Integer id);

    List<JDProductLib>  query(String searchbrand,String searchword);

     List<JDProductLib> queryByObj(ProductVo productVo);

    List<Map<String,Object>> zgfl(int level,int parentid);
}