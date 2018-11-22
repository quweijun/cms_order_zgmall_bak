package com.zgmall.dao.product.impl;

import com.zgmall.dao.product.JDProductLibDao;
import com.zgmall.model.product.JDProductLib;
import com.zgmall.vo.ProductVo;
import com.zgmall.mapper.businessdb.product.JDProductLibMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;



@Service("JDProductLibDao")
public class JDProductLibDaoImpl implements JDProductLibDao {
    @Autowired
    JDProductLibMapper jdProductLibMapper;
    @Override
    public void add(List<JDProductLib> jdProductLibList) {
        jdProductLibMapper.insertList(jdProductLibList);

    }
    @Override
    public void del(JDProductLib jdProductLib) {
        Example example = new Example(JDProductLib.class);

        if(jdProductLib.getId()!=null&&!jdProductLib.getId().equals("")){
            example.createCriteria().andCondition("id= ",jdProductLib.getId());
        }else{
            example.createCriteria().andCondition("id= ",jdProductLib.getId());
        }

        jdProductLibMapper.deleteByExample(example);
    }
    @Override
    public List<JDProductLib> selectProductAll() {
        return  jdProductLibMapper.selectAll();
      }

    @Override
    public void update(JDProductLib jdProductLib) {
        if(jdProductLib.getEnableflag()!=null){
            Example example = new Example(JDProductLib.class);
            example.createCriteria().andCondition("id= ",jdProductLib.getId());
            jdProductLibMapper.updateByExampleSelective(jdProductLib,example);
        }
    }

    @Override
    public List<JDProductLib> selectProduct(Integer id) {
        JDProductLib jdProductLib=new JDProductLib();
        jdProductLib.setId(id);
        List<JDProductLib> jdProductLibList=new ArrayList<>();
        jdProductLibList.add(jdProductLibMapper.selectOne(jdProductLib));
        return jdProductLibList;
    }
    @Override
    public  List<JDProductLib> query(String searchbrand,String searchword ) {
        List<JDProductLib> list=jdProductLibMapper.query(searchbrand,searchword);
        return list;
    }

    /**
     * 根据QueryByObj对象查询产品
     * @param productVo
     * @return
     */
    @Override
    public  List<JDProductLib> queryByObj(ProductVo productVo) {
        List<JDProductLib> list=jdProductLibMapper.queryByObj(productVo);
        //System.out.println("========"+new Gson().toJson(productVo));
        return list;
    }
    @Override
    public List<Map<String,Object>> zgfl(int level,int parentid){
        return jdProductLibMapper.zgfl(level,parentid);
    }
}
