package com.zgmall.controller.console.menu;

import com.github.pagehelper.PageHelper;
import com.zgmall.model.ButtonAlias;
import com.zgmall.service.console.ButtonAliasService;
import com.zgmall.common.util.PageUtils;
import com.zgmall.common.util.exception.ExceptionContent;
import com.zgmall.common.util.exception.RestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by zhb on 2017/12/4.
 */
@RestController
@RequestMapping("/buttonAlias")
public class ButtonAliasController {
    @Autowired
    ButtonAliasService buttonAliasService;

    @RequestMapping("/add")
    public Map<String, Object> add(@RequestBody ButtonAlias buttonAlias) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            buttonAliasService.add(buttonAlias);
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
    @RequestMapping("/del")
    public Map<String, Object> del(@RequestBody ButtonAlias buttonAlias) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            buttonAliasService.del(buttonAlias);
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
    @RequestMapping("/selectAll/{p}")
    public Map<String, Object> selectAll(@PathVariable int p) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            if(p>0){
                PageHelper.startPage(p, PageUtils.PAGE_TEN);
            }
            resultMap.putAll(buttonAliasService.selectAll());
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
}
