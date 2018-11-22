package com.gene.common.util;

import com.google.gson.Gson;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.shiro.crypto.hash.Md5Hash;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

/**
 * Created by zhb on 2017/11/27.
 */
public class CommUtil {
    public static String retrunObject(Object obj) {
        return obj == null ? "" : obj.toString();
    }
    public static Integer retrunInteger(Object obj)
        {
            return obj == null ? null : Integer.parseInt(obj.toString());
        }

    //获取时间戳
    public static int getNowTime(){
        return (int)(System.currentTimeMillis()/1000);
    }
    //解析时间戳
    public static String getDateTime(long time){

        Date nowTime = new Date(time*1000);

        SimpleDateFormat sdFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String retStrFormatNowDate = sdFormatter.format(nowTime);

        return retStrFormatNowDate;
    }
    //获取UUid
    public static String generateUUID(){

        String s = UUID.randomUUID().toString();

        //去掉“-”符号
        return s.substring(0,8)+s.substring(9,13)+s.substring(14,18)+s.substring(19,23)+s.substring(24);
    }
    //获取指定长度uuid
    public static String generateRandom(int len){

        return RandomStringUtils.randomAlphanumeric(len);
    }
    //获取完整uuid
    public static String generate() {

        return RandomStringUtils.random(32, true, true);
    }
    //MD5 加密密码
    public static String generatePassword(String password,String salt){

        String md5 = new Md5Hash(password, salt,2).toString();//还可以转换为 toBase64()/toHex()
        return md5;
    }
    //MAP to JSON
    public static String convertMapToJson(Map m){
        return new Gson().toJson(m);
    }
    public static String ConvertObjectToJson(Object o) {
        return new Gson().toJson(o);
    }
}
