package com.zgmall.controller.product;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.zgmall.service.product.JDProductLibService;
import com.zgmall.common.util.PageUtils;
import com.zgmall.common.util.exception.ExceptionContent;
import com.zgmall.common.util.exception.RestException;
import com.zgmall.vo.ProductVo;
//import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping("/product")
public class ProductController {
    //log4j
    //private static Logger logger = Logger.getLogger(ProductController.class);
    //logback
    private static Logger logger = LoggerFactory.getLogger(ProductController.class);
    @Autowired
    JDProductLibService jdProductLibService;

    @RequestMapping("/selectAll/{p}")
    public Map<String, Object> selectAll(@PathVariable int p) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            if(p>0){
                PageHelper.startPage(p, PageUtils.PAGE_TWENTY);
            }
            resultMap.putAll(jdProductLibService.selectAllByMap());
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
    @RequestMapping("/query")
    public Map<String, Object> query(@RequestBody ProductVo productVo) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            int p=productVo.getP();
            int psize=productVo.getPsize();
            if (psize<=0) psize=PageUtils.PAGE_FIFTEEN;
            if(p>0){
                PageHelper.startPage(p,psize);
            }
            logger.info(new Gson().toJson(productVo));
            resultMap.putAll(jdProductLibService.query(productVo));
            //logger.info(new Gson().toJson(resultMap));
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;

    }
    @RequestMapping("/update")
    public Map<String, Object> update(@RequestBody ProductVo productVo) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            //logger.info(productVo.getId()+"="+productVo.getEnableflag());
            jdProductLibService.update(productVo);
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
    /**
     * 查询当前用户的所有角色
     * @return
     * @throws RestException
     */
    @RequestMapping("/selectProduct/{id}")
    public Map<String, Object> selectProductById(@PathVariable Integer id) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            resultMap.putAll(jdProductLibService.selectProductById(id));
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
    @RequestMapping("/add")
    public Map<String, Object> add(@RequestBody ProductVo productVo) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            jdProductLibService.add(productVo);
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
    @GetMapping("/del/{id}")
    public Map<String, Object> del(@PathVariable int id) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            jdProductLibService.del(id);
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
            JSONObject jtop = new JSONObject();
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);


        }
        return resultMap;
    }

    @RequestMapping("/zgfl/{level},{parentid}")
    public Map<String, Object> productfl(@PathVariable int level,@PathVariable int parentid) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        resultMap.putAll(jdProductLibService.zgfl(level,parentid));
        resultMap.put("code", ExceptionContent.SUCCESS);
        resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        return resultMap;
    }
    @RequestMapping("/listbigtype")
    public Map<String, Object> listBigType() throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            PageInfo pageInfo = new PageInfo<>(jdProductLibService.listBigType());
            resultMap.put("pageInfo", pageInfo);
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
    @RequestMapping("/listtopprod/{topnum}")
    public Map<String, Object> listTopProd(@PathVariable int topnum) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{

            PageInfo pageInfo = new PageInfo<>(jdProductLibService.listTopProduct(topnum));
            resultMap.put("pageInfo", pageInfo);
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
}
