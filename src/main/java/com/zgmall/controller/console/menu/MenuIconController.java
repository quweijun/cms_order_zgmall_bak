package com.zgmall.controller.console.menu;

import com.github.pagehelper.PageHelper;
import com.zgmall.model.MenuIcon;
import com.zgmall.service.console.MenuIconService;
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
@RequestMapping("/menuIcon")
public class MenuIconController {
    @Autowired
    MenuIconService menuIconService;
    /**
     *
     * @param menuIcon
     * @return
     * @throws RestException
     */
    @RequestMapping("/add")
    public Map<String, Object> add(@RequestBody MenuIcon menuIcon) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            menuIconService.add(menuIcon);
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }

    /**
     * 删除图标
     * @param menuIcon
     * @return
     * @throws RestException
     */
    @RequestMapping("/del")
    public Map<String, Object> del(@RequestBody MenuIcon menuIcon) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            menuIconService.del(menuIcon);
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }

    /**
     * 查询图标
     * @return
     * @throws RestException
     */
    @RequestMapping("/selectAll/{p}")
    public Map<String, Object> selectInconAll(@PathVariable int p,@RequestBody Map<String, Object> paramlist) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        try{
            PageHelper.startPage(p, PageUtils.PAGE_FIFTEEN);
            resultMap.putAll(menuIconService.selectInconAll(paramlist.get("queryIcon").toString()));
            resultMap.put("code", ExceptionContent.SUCCESS);
            resultMap.put("message", ExceptionContent.SUCCESS_MSG);
        }catch (Exception e){
            e.printStackTrace();
            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);
        }
        return resultMap;
    }
}
