package com.zgmall.service.product;

import com.zgmall.model.product.Bigtype;
import com.zgmall.model.product.JDProductLib;
import com.zgmall.vo.ProductVo;

import java.util.List;
import java.util.Map;


public interface JDProductLibService {

    void  add(ProductVo productVo);

    void del(int id);

    List<JDProductLib> selectAll();

    List<Bigtype> listBigType();

    List<JDProductLib> listTopProduct(int topnum);

    Map<String, Object> selectAllByMap();

    void update(ProductVo productVo);

    Map<String, Object> selectProductById(Integer id);

    Map<String, Object> query(ProductVo productVo);

    Map<String, Object> zgfl(int level,int parentid);
}
