package com.zgmall.controller.bussiness;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.google.gson.Gson;

import com.zgmall.model.bussiness.Hdtable;
import com.zgmall.service.bussiness.HdtableService;
import com.zgmall.common.util.PageUtils;
import com.zgmall.common.util.exception.ExceptionContent;
import com.zgmall.common.util.exception.RestException;

import com.zgmall.vo.bussiness.HdtableVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping("/bussiness")
public class HdtableController {
    //logback
    private static Logger logger = LoggerFactory.getLogger(HdtableController.class);
    @Autowired
    HdtableService hdtableService;

    @RequestMapping("/hdtable/list")
    public Map<String, Object> selectList(@RequestBody HdtableVo hdtableVo) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            int p=hdtableVo.getP();
            int psize=hdtableVo.getPsize();
            if (psize<=0) psize=PageUtils.PAGE_TEN;
            if(p>0){
                PageHelper.startPage(p,psize);
            }
            resultMap.putAll(hdtableService.selectList(hdtableVo));
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
    @RequestMapping("/hdtable/{id}")
    public Map<String, Object> selectById(@PathVariable int id) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            HdtableVo hdtableVo=new HdtableVo();
            hdtableVo.setHdid(id);
            resultMap.putAll(hdtableService.selectList(hdtableVo));
            //logger.info(new Gson().toJson(resultMap));
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
    @RequestMapping("/hdtable/add")
    public Map<String, Object> add(@RequestBody HdtableVo hdtableVo) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            hdtableService.add(hdtableVo);
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }

    @RequestMapping("/hdtable/update")
    public Map<String, Object> update(@RequestBody HdtableVo hdtableVo) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            logger.info(new Gson().toJson(hdtableVo));
            hdtableService.update(hdtableVo);
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
    @RequestMapping("/hdtable/del")
    public Map<String, Object> del(@RequestBody HdtableVo hdtableVo) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            hdtableService.del(hdtableVo);
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
}
