package com.zgmall.service.product.impl;

import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.zgmall.dao.product.JDProductLibDao;
import com.zgmall.mapper.businessdb.product.BigtypeMapper;
import com.zgmall.mapper.businessdb.product.JDProductLibMapper;
import com.zgmall.model.product.Bigtype;
import com.zgmall.model.product.JDProductLib;
import com.zgmall.common.redis.ProductRedis;
import com.zgmall.service.product.JDProductLibService;

import com.zgmall.common.util.BeanUtil;
import com.zgmall.vo.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.neo.galaxy.core.util.BeanUtil;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Service("JDProductLibService")
public class JDProductLibServiceImpl implements JDProductLibService {
    private static Logger logger = LoggerFactory.getLogger(JDProductLibService.class);
    @Autowired
    JDProductLibDao jdProductLibDao;
    @Autowired
    JDProductLibMapper jdProductLibMapper;
    @Autowired
    private ProductRedis productRedis;
    @Autowired
    private BigtypeMapper bigtypeMapper;
    private static final String keyHead = "mysql:get:product:";

    @Override
    public void add(ProductVo productVo) {
        List<JDProductLib> jdProductLibList=new ArrayList<>();
        JDProductLib jdProductLib=new JDProductLib();
            //对象属性复制
        try { BeanUtil.copyGmProperties(jdProductLib,productVo); }  catch (Exception ex){  logger.info(ex.getMessage()); }
        jdProductLibList.add(jdProductLib);
        jdProductLibDao.add(jdProductLibList);

    }

    @Override
    public void del(int id) {
        JDProductLib jdProductLib=new JDProductLib();
        jdProductLib.setId(id);
        jdProductLibDao.del(jdProductLib);
    }
    @Override
    public List<JDProductLib> selectAll(){
        List<JDProductLib> jdProductLibList=jdProductLibDao.selectProductAll();
        logger.info("jdProductLibList.size():"+jdProductLibList.size());
        return jdProductLibList;
    }

    @Override
    public List<Bigtype> listBigType() {
        return bigtypeMapper.selectAll();
    }

    /**
     * 返回人气TOP商品
     * @param topnum
     * @return
     */
    @Override
    public List<JDProductLib> listTopProduct(int topnum) {
        return jdProductLibMapper.listTopProduct(topnum);
    }
    @Override
    public Map<String, Object> selectAllByMap() {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        List<JDProductLib> jdProductLibList = jdProductLibDao.selectProductAll();
        PageInfo pageInfo = new PageInfo<>(jdProductLibList);
        resultMap.put("pageInfo", pageInfo);
        return resultMap;
    }
    @Override
    public void update(ProductVo productVo) {
        if(productVo.getEnableflag()!=null) {
            JDProductLib jdProductLib = new JDProductLib();
            try {
                //BeanUtil.copyGmProperties(jdProductLib, productVo);
                //System.out.println("==========================");
                //对象属性复制
                BeanUtil.copyGmProperties(jdProductLib,productVo);

               //PropertiesCopyUtil.copyProperties(productVo,jdProductLib.getClass());
                //jdProductLib.setId(productVo.getId());
                //jdProductLib.setEnableflag(productVo.getEnableflag());
            }
            catch (Exception ex){
                logger.info(ex.getMessage());
            }
            jdProductLibDao.update(jdProductLib);
        }
    }

    @Override
    public Map<String, Object> selectProductById(Integer id) {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        //判断缓存中是否存在
        List<JDProductLib> jdProductLibList=productRedis.getList(keyHead + id);
        if (jdProductLibList==null) {
           jdProductLibList = jdProductLibDao.selectProduct(id);
           //加入缓存
           if (jdProductLibList!=null) {
               productRedis.add(keyHead + id, 30L, jdProductLibList);
               logger.info("产品对象写入缓存！！！"+jdProductLibList.get(0).getCpid());
           }
        }
        else {
            logger.info("产品对象从缓存中获取！！！"+jdProductLibList.get(0).getCpid());
        }
        resultMap.put("jdProductLibList", jdProductLibList);
        return resultMap;
    }

    @Override
    public Map<String, Object> query(ProductVo productVo) {
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        //List<JDProductLib> productList =jdProductLibDao.query(productVo.getSearchbrand(),productVo.getSearchword());
        List<JDProductLib> productList =jdProductLibDao.queryByObj(productVo);
        PageInfo pageInfo = new PageInfo<>(productList);
        resultMap.put("pageInfo", pageInfo);
        //System.out.println(CommUtil.ConvertObjectToJson(resultMap));
        //logger.info(CommUtil.ConvertObjectToJson(resultMap));
        System.out.println(new Gson().toJson(resultMap));
        return resultMap;
    }
    @Override
    public Map<String, Object> zgfl(int level,int parentid){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        resultMap.put("zgfl",jdProductLibDao.zgfl(level,parentid));
        return resultMap;
    }
}
