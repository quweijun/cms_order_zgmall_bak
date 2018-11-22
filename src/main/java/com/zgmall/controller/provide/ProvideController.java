package com.zgmall.controller.provide;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.google.gson.Gson;

import com.zgmall.model.provide.Provide;
import com.zgmall.service.provide.ProvideService;
import com.zgmall.common.util.PageUtils;
import com.zgmall.common.util.exception.ExceptionContent;
import com.zgmall.common.util.exception.RestException;

import com.zgmall.vo.provide.ProvideVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping("/provide")
public class ProvideController {
    //logback
    private static Logger logger = LoggerFactory.getLogger(ProvideController.class);
    @Autowired
    ProvideService provideService;

    @RequestMapping("/provide/list")
    public Map<String, Object> selectList(@RequestBody ProvideVo provideVo) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            int p=provideVo.getP();
            int psize=provideVo.getPsize();
            if (psize<=0) psize=PageUtils.PAGE_FIFTEEN;
            if(p>0){
                PageHelper.startPage(p,psize);
            }
            resultMap.putAll(provideService.selectList(provideVo));
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
    @RequestMapping("/provide/{id}")
    public Map<String, Object> selectById(@PathVariable int id) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            ProvideVo provideVo=new ProvideVo();
            provideVo.setId(id);
            resultMap.putAll(provideService.selectList(provideVo));
            //logger.info(new Gson().toJson(resultMap));
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
    @RequestMapping("/provide/add")
    public Map<String, Object> add(@RequestBody ProvideVo provideVo) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            provideService.add(provideVo);
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }

    @RequestMapping("/provide/update")
    public Map<String, Object> update(@RequestBody ProvideVo provideVo) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            logger.info(new Gson().toJson(provideVo));
            provideService.update(provideVo);
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
    @RequestMapping("/provide/del")
    public Map<String, Object> del(@RequestBody ProvideVo provideVo) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            provideService.del(provideVo);
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
}
