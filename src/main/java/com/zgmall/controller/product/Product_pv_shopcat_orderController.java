package com.zgmall.controller.product;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.google.gson.Gson;

import com.zgmall.model.product.Product_pv_shopcat_order;
import com.zgmall.service.product.Product_pv_shopcat_orderService;
import com.zgmall.common.util.PageUtils;
import com.zgmall.common.util.exception.ExceptionContent;
import com.zgmall.common.util.exception.RestException;

import com.zgmall.vo.product.Product_pv_shopcat_orderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping("/product")
public class Product_pv_shopcat_orderController {
    //logback
    private static Logger logger = LoggerFactory.getLogger(Product_pv_shopcat_orderController.class);
    @Autowired
    Product_pv_shopcat_orderService product_pv_shopcat_orderService;

    @RequestMapping("/product_pv_shopcat_order/list")
    public Map<String, Object> selectList(@RequestBody Product_pv_shopcat_orderVo product_pv_shopcat_orderVo) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            int p=product_pv_shopcat_orderVo.getP();
            int psize=product_pv_shopcat_orderVo.getPsize();
            if (psize<=0) psize=PageUtils.PAGE_TEN;
            if(p>0){
                PageHelper.startPage(p,psize);
            }
            resultMap.putAll(product_pv_shopcat_orderService.selectList(product_pv_shopcat_orderVo));
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
    @RequestMapping("/product_pv_shopcat_order/{id}")
    public Map<String, Object> selectById(@PathVariable int id) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            Product_pv_shopcat_orderVo product_pv_shopcat_orderVo=new Product_pv_shopcat_orderVo();
            product_pv_shopcat_orderVo.setId(id);
            resultMap.putAll(product_pv_shopcat_orderService.selectList(product_pv_shopcat_orderVo));
            //logger.info(new Gson().toJson(resultMap));
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
    @RequestMapping("/product_pv_shopcat_order/add")
    public Map<String, Object> add(@RequestBody Product_pv_shopcat_orderVo product_pv_shopcat_orderVo) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            product_pv_shopcat_orderService.add(product_pv_shopcat_orderVo);
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }

    @RequestMapping("/product_pv_shopcat_order/update")
    public Map<String, Object> update(@RequestBody Product_pv_shopcat_orderVo product_pv_shopcat_orderVo) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            logger.info(new Gson().toJson(product_pv_shopcat_orderVo));
            product_pv_shopcat_orderService.update(product_pv_shopcat_orderVo);
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
    @RequestMapping("/product_pv_shopcat_order/del")
    public Map<String, Object> del(@RequestBody Product_pv_shopcat_orderVo product_pv_shopcat_orderVo) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            product_pv_shopcat_orderService.del(product_pv_shopcat_orderVo);
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
}
