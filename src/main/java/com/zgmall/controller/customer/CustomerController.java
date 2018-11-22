package com.zgmall.controller.customer;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.google.gson.Gson;
import com.zgmall.model.customer.Customer;
import com.zgmall.service.customer.CustomerService;
import com.zgmall.common.util.PageUtils;
import com.zgmall.common.util.exception.ExceptionContent;
import com.zgmall.common.util.exception.RestException;
//import org.apache.log4j.Logger;

import com.zgmall.service.customer.ScoreRuleService;
import com.zgmall.vo.customer.CustomerVo;
import com.zgmall.vo.customer.ScoreRuleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping("/customer")
public class CustomerController {
    //logback
    private static Logger logger = LoggerFactory.getLogger(CustomerController.class);
    @Autowired
    CustomerService customerService;
    @Autowired
    ScoreRuleService scoreRuleService;

    @RequestMapping("/customerlist")
    public Map<String, Object> listCustomer(@RequestBody CustomerVo customerVo) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            int p=customerVo.getP();
            int psize=customerVo.getPsize();
            if (psize<=0) psize=PageUtils.PAGE_TEN;
            //if (customerVo.getPsize()<=0) customerVo.setPsize(PageUtils.PAGE_FIFTEEN);
            if(p>0){
                PageHelper.startPage(p,psize);
            }
            resultMap.putAll(customerService.selectCustomerList(customerVo));
            logger.info(new Gson().toJson(customerVo));
            logger.info(new Gson().toJson(resultMap));
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
    @RequestMapping("/scorerules")
    public Map<String, Object> listScoreRules(@RequestBody ScoreRuleVo scoreRuleVo) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            int p=scoreRuleVo.getP();
            int psize=scoreRuleVo.getPsize();
            if (psize<=0) psize=PageUtils.PAGE_TEN;
            if(p>0){
                PageHelper.startPage(p,psize);
            }
            resultMap.putAll(scoreRuleService.selectScoreRuleList(scoreRuleVo));
            logger.info(new Gson().toJson(resultMap));
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
    @RequestMapping("/getscorerule/{id}")
    public Map<String, Object> selectProductById(@PathVariable int id) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            ScoreRuleVo scoreRuleVo=new ScoreRuleVo();
            scoreRuleVo.setScoreRuleId(id);
            resultMap.putAll(scoreRuleService.selectScoreRuleList(scoreRuleVo));
            logger.info(new Gson().toJson(resultMap));
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
    @RequestMapping("/scorerules/add")
    public Map<String, Object> addScoreRule(@RequestBody ScoreRuleVo scoreRuleVo) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            scoreRuleService.add(scoreRuleVo);
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }

    @RequestMapping("/scorerules/update")
    public Map<String, Object> update(@RequestBody ScoreRuleVo scoreRuleVo) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            logger.info(new Gson().toJson(scoreRuleVo));
            scoreRuleService.update(scoreRuleVo);
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
    @RequestMapping("/scorerules/del")
    public Map<String, Object> delScoreRule(@RequestBody ScoreRuleVo scoreRuleVo) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            scoreRuleService.del(scoreRuleVo);
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
}
