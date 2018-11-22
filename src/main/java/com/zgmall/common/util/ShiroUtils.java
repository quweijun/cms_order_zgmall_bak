package com.zgmall.common.util;

import com.zgmall.common.util.exception.ExceptionContent;
import com.zgmall.common.util.exception.RestException;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

public class ShiroUtils {
    public static Subject getSubject() {
        return SecurityUtils.getSubject();
    }

    public static Session getSession() {
        return SecurityUtils.getSubject().getSession();
    }

    public static void setSessionAttribute(Object key, Object value) {
        getSession().setAttribute(key, value);
    }

    public static String getKaptcha(String kaptchaSessionKey) throws RestException {
        Object kaptcha = getSession().getAttribute(kaptchaSessionKey);
        if (kaptcha == null) {
            throw new RestException(ExceptionContent.USER_KAPTCHAVALIDAT_MSG, ExceptionContent.USER_KAPTCHAVALIDAT_CODE);
        }
        getSession().removeAttribute(kaptchaSessionKey);
        return kaptcha.toString();
    }
}
