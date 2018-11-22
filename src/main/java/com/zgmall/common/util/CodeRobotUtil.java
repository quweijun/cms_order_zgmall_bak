package com.zgmall.common.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class CodeRobotUtil {
    public static String UpperFirstChar(String src){
        return src.substring(0,1).toUpperCase()+src.substring(1,src.length()).toLowerCase();
    }
    public static String tablename2class(String tablename) {

        return tablename.substring(0,1).toUpperCase()+tablename.substring(1,tablename.length()).toLowerCase();
    }
    public static String fieldname2value(String fieldname){
        return fieldname.substring(0,1).toUpperCase()+fieldname.substring(1,fieldname.length()).toLowerCase();
    }
    public static String fieldname2method(String fieldname,String methodtype){
        String rtstr="";
        if (methodtype.equals("get")) {

        }
        if (methodtype.equals("post")) {

        }
        return null;
    }
    public static String convertFieldType(String fieldtype) {
        String rtstr="";
        switch (fieldtype) {
            case "int":
                rtstr="Integer";
                break;
            case "bigint":
                rtstr= "Integer";
                break;
            case "varchar":
                rtstr= "String";
                break;
            case "longtext":
                rtstr= "String";
                break;
            case "datetime":
                rtstr= "Date";
                break;
            case "timestamp":
                rtstr= "Date";
                break;
            case "double":
                rtstr= "long";
                break;
            case "decimal":
                rtstr= "float";
                break;
            default:
                rtstr= "String";
                break;
        }
        return rtstr;
    }
    public  static void writefile(StringBuffer buf ,String rootpath,String childpath,String filename) {
        //目录不存在创建目录
        File filePath=new File(rootpath,childpath);
        try {
            if(!filePath.exists()) filePath.mkdirs();
        }catch(Exception ex) {
            ex.printStackTrace();
        }
        //文件不存在创建文件
        File file = new File(rootpath+"/"+childpath+"/"+filename);
        try {
            if (!file.exists()) {
                System.out.println("no exists!");
                file.createNewFile();
            }

//            FileWriter fileWritter = new FileWriter(file.getName(),true);
//            System.out.println(buf.toString());
//            fileWritter.write(buf.toString());
//            fileWritter.close();
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(buf.toString());
            bw.close();
            System.out.println("Done");
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        //file.createNewFile()
        System.out.println(file.getAbsolutePath());

    }
}
