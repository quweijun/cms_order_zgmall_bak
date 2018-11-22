package com.zgmall.controller.console.login;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import com.zgmall.model.SysUser;
import com.zgmall.service.console.SysUserService;
import com.zgmall.common.util.ShiroUtils;
import com.zgmall.common.util.exception.ExceptionContent;
import com.zgmall.common.util.exception.RestException;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/sys")
public class LoginController {
    @Autowired
    SysUserService sysUserService;
    @Autowired
    Producer producer;
   /* @Value("${SSO_URL}")
    private String SSO_URL;*/
    @RequestMapping("/captcha")
    public void captcha(HttpServletResponse response,HttpServletRequest request) throws ServletException, IOException {
        response.setHeader("Cache-Control", "no-store, no-cache");
        response.setContentType("image/jpeg");

        //生成文字验证码
        String text = producer.createText();
        //生成图片验证码
        BufferedImage image = producer.createImage(text);
        //保存到shiro session
        ShiroUtils.setSessionAttribute(Constants.KAPTCHA_SESSION_KEY, text);
//        request.getSession().setAttribute(Constants.KAPTCHA_SESSION_KEY, text);
        ServletOutputStream out = response.getOutputStream();
        ImageIO.write(image, "jpg", out);
        out.flush();
    }

    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody SysUser sysUser, String captcha, HttpServletRequest request, HttpServletResponse response) throws RestException {
        Map<String, Object> resultMap = new LinkedHashMap<>();
//        String kaptcha = (String) request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
        String kaptcha = ShiroUtils.getKaptcha(Constants.KAPTCHA_SESSION_KEY);
        if (!kaptcha.equalsIgnoreCase(captcha)) {
            throw new RestException(ExceptionContent.USER_KAPTCHAVALIDATE_MSG, ExceptionContent.USER_KAPTCHAVALIDATE_CODE);
        }
        try {
            Subject subject = ShiroUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(sysUser.getUserName(), sysUser.getUserPassword());
            token.setRememberMe(false);
            subject.login(token);
            subject.getSession().setTimeout(3600000);//设置登录超时时间为60分钟-20180821
        } catch (UnknownAccountException e) {
            throw new RestException(ExceptionContent.USER_UNKNOWNACCOUNT_MSG, ExceptionContent.USER_UNKNOWNACCOUNT_CODE);
        } catch (IncorrectCredentialsException e) {
            throw new RestException(ExceptionContent.USER_INCORRECTCREDENTIALS_MSG, ExceptionContent.USER_INCORRECTCREDENTIALS_CODE);
        } catch (LockedAccountException e) {
            throw new RestException(ExceptionContent.USER_LOCKEDACCOUNT_MSG, ExceptionContent.USER_LOCKEDACCOUNT_CODE);
        } catch (AuthenticationException e) {
            throw new RestException(ExceptionContent.USER_AUTHENTICATION_MSG, ExceptionContent.USER_AUTHENTICATION_CODE);
        }
        resultMap.put("code", 200);
        return resultMap;
    }


 /*   @RequestMapping("/info")
    public Map<String, Object> info() {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        SysUser sysUser = (SysUser)ShiroUtils.getSubject().getPrincipal();
        resultMap.put("sysUser", sysUser);
        resultMap.put("url",SSO_URL);
        return resultMap;
    }
*/
}
