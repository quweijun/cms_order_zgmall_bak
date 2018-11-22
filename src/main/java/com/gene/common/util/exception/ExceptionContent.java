package com.gene.common.util.exception;


public class ExceptionContent {
    public static final int SUCCESS = 200;
    public static final String SUCCESS_MSG = "成功!";

    public static final int  SYS_ERROR_CODE= 10000;
    public static final String SYS_ERROR_MESSAGE  = "系统错误!";

    public static final int SELECT_ERROR_CODE = 10001;
    public static final String SELECT_ERROR_MSG = "查询错误!";

    public static final int INSERT_ERROR_CODE = 10002;
    public static final String INSERT_ERROR_MSG = "插入错误!";

    public static final int UPDATE_ERROR_CODE = 10003;
    public static final String UPDATE_ERROR_MSG = "修改错误!";

    public static final int DELETE_ERROR_CODE = 10004;
    public static final String DELETE_ERROR_MSG = "删除错误!";

    public static final int USER_UNKNOWNACCOUNT_CODE= 101;
    public static final String USER_UNKNOWNACCOUNT_MSG = "账号不存在!";

    public static final int USER_INCORRECTCREDENTIALS_CODE= 102;
    public static final String USER_INCORRECTCREDENTIALS_MSG = "密码不正确!";



    public static final int USER_LOCKEDACCOUNT_CODE= 103;
    public static final String USER_LOCKEDACCOUNT_MSG = "帐号锁定,请联系管理员!";

    public static final int USER_AUTHENTICATION_CODE= 104;
    public static final String USER_AUTHENTICATION_MSG = "账户验证失败!";

    public static final int USER_KAPTCHAVALIDATE_CODE= 105;
    public static final String USER_KAPTCHAVALIDATE_MSG = "验证码错误!";

    public static final int USER_KAPTCHAVALIDAT_CODE= 106;
    public static final String USER_KAPTCHAVALIDAT_MSG = "验证码失效!";
}
