package com.zgmall.config.filter;

import com.alibaba.fastjson.JSONObject;
import com.zgmall.controller.product.ProductController;
import com.zgmall.model.SysUser;
import com.zgmall.common.util.constant.ConstantUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.AccessControlFilter;
import org.apache.shiro.web.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Configurable;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
@Configurable
public class LoginFilter extends AccessControlFilter {

    private HttpServletRequest request;
    private HttpServletResponse response;
    private static Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Override
    protected boolean isAccessAllowed(ServletRequest servletRequest, ServletResponse servletResponse, Object o) throws Exception {
        return false;
    }

    @Override
    protected boolean onAccessDenied(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {

        //测试输出shiro timeout时间，默认30分钟，在LoginController.login方法钟已修改为60分钟
        //System.out.println(getSubject(request, response).getSession().getTimeout());
        logger.info(String.valueOf(getSubject(request, response).getSession().getTimeout()));
        //upm with shiro subject/principal
        Subject user = SecurityUtils.getSubject();

        SysUser sysUser = (SysUser) user.getPrincipal();

        if (null != sysUser) {// && isEnabled()
            return Boolean.TRUE;
        }

        this.request = (HttpServletRequest) servletRequest;
        this.response = (HttpServletResponse) servletResponse;

        String basePath = request.getRequestURL().toString();
        // ajax请求
        if ("XMLHttpRequest".equalsIgnoreCase(request.getHeader("X-Requested-With"))) {
            Map<String, String> resultMap = new HashMap<>();
            // "当前用户没有登录，并且是Ajax请求！");
            resultMap.put("code", "300");
            resultMap.put("message", "会话已经过期，请重新登录！");//当前用户没有登录！
            resultMap.put("url", ConstantUtil.SSO_URL);
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json;charset=UTF-8");
            response.getWriter().write(JSONObject.toJSONString(resultMap));
            return false;
        }
        //System.out.println("=============timeout==========");
        //重定向
        WebUtils.issueRedirect(request, response, ConstantUtil.SSO_URL + "?redirect=" + basePath);
        return false;
    }
}
