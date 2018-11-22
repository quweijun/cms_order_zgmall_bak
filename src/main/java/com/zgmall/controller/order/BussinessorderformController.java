package com.zgmall.controller.order;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.google.gson.Gson;

import com.zgmall.model.order.Bussinessorderform;
import com.zgmall.service.order.BussinessorderformService;
import com.zgmall.common.util.PageUtils;
import com.zgmall.common.util.exception.ExceptionContent;
import com.zgmall.common.util.exception.RestException;

import com.zgmall.vo.order.BussinessorderformVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping("/order")
public class BussinessorderformController {
    //logback
    private static Logger logger = LoggerFactory.getLogger(BussinessorderformController.class);
    @Autowired
    BussinessorderformService bussinessorderformService;

    @RequestMapping("/bussinessorderform/list")
    public Map<String, Object> selectList(@RequestBody BussinessorderformVo bussinessorderformVo) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            int p=bussinessorderformVo.getP();
            int psize=bussinessorderformVo.getPsize();
            if (psize<=0) psize=PageUtils.PAGE_TEN;
            if(p>0){
                PageHelper.startPage(p,psize);
            }
            resultMap.putAll(bussinessorderformService.selectList(bussinessorderformVo));
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
    @RequestMapping("/bussinessorderform/{id}")
    public Map<String, Object> selectById(@PathVariable String id) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            BussinessorderformVo bussinessorderformVo=new BussinessorderformVo();
            bussinessorderformVo.setOrderid(id);
            resultMap.putAll(bussinessorderformService.selectList(bussinessorderformVo));
            //logger.info(new Gson().toJson(resultMap));
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
    @RequestMapping("/bussinessorderform/add")
    public Map<String, Object> add(@RequestBody BussinessorderformVo bussinessorderformVo) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            bussinessorderformService.add(bussinessorderformVo);
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }

    @RequestMapping("/bussinessorderform/update")
    public Map<String, Object> update(@RequestBody BussinessorderformVo bussinessorderformVo) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            //logger.info(new Gson().toJson(bussinessorderformVo));
            bussinessorderformService.update(bussinessorderformVo);
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
    @RequestMapping("/bussinessorderform/del")
    public Map<String, Object> del(@RequestBody BussinessorderformVo bussinessorderformVo) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            bussinessorderformService.del(bussinessorderformVo);
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
}
