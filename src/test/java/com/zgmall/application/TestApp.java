package com.zgmall.application;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.sun.tools.internal.ws.processor.model.Model;
import com.zgmall.base.util.CopyObject;
import com.zgmall.model.provide.Provide;
import com.zgmall.vo.provide.ProvideVo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import static javafx.scene.input.KeyCode.S;

public class TestApp {
    //列出类所有属性名,
    public void listClassAllProp(Object obj) {
    List<Field> fieldList = new ArrayList<>() ;
    Class tempClass=obj.getClass() ;
    while (tempClass != null) {//当父类为null的时候说明到达了最上层的父类(Object类).
        fieldList.addAll(Arrays.asList(tempClass .getDeclaredFields()));
        tempClass = tempClass.getSuperclass(); //得到父类,然后赋给自己
    }
    for (Field f : fieldList)
    {
        //System.out.println("getFields---" + f.getName());
        String name=f.getName();
        name = name.substring(0,1).toUpperCase()+name.substring(1);
        try {
            String rtValue=CopyObject.runObjectMethod(obj, "get" + name, "", 1);
            System.out.println(name+"="+rtValue);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
   }
        //获取对象所有不为空的属性值
    public void getValue(Object obj){
        Field[] field = obj.getClass().getDeclaredFields();

        for(int j=0 ; j<field.length ; j++){
            String name = field[j].getName();

            name = name.substring(0,1).toUpperCase()+name.substring(1);
            String type = field[j].getGenericType().toString();
            System.out.println(name+":"+type);
            //if(type.equals("class java.lang.String")){
                Method m;
                String value;
                try {
                    m = obj.getClass().getMethod("get"+name);
                    value = String.valueOf(m.invoke(obj));
                    if(value != null && !"".equals(value)){
                        System.out.println(name);
                        System.out.println(value);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            //}
        }
    }
    public void testCopyObject() {
        ProvideVo provideVo=new ProvideVo();
        provideVo.setP(10);
        provideVo.setId(100);
        provideVo.setFlag(1);
        provideVo.setLinkman("hello");
        provideVo.setSh_mobile("1111");
        provideVo.setProvidename("32342de得2222");
        List<String[]> list=CopyObject.getFieldAndValues(provideVo);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)[0]+":"+list.get(i)[1]+":"+list.get(i)[2]+":"+list.get(i)[3]);
        }
    }
    public void testApiJs(String modulename,String tablename){
        String apijsfile="D:\\Program Files\\nodejs\\vuejsapp\\cms_ui\\src\\config\\api.js";
        File file=new File(apijsfile);
        if (!file.exists()) {
            try {
                file.createNewFile();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        try {
            FileReader reader = new FileReader(file.getAbsoluteFile());
            BufferedReader br=new BufferedReader(reader);
            String contentLine = br.readLine();
            StringBuffer buf=new StringBuffer();
            while (contentLine != null) {
                //System.out.println(contentLine);
                buf.append(contentLine+"\n");
                contentLine = br.readLine();
            }
            System.out.println(buf.toString());
            int modulePosLeft=0;
            int modulePosRight=0;
            modulePosLeft=buf.indexOf(modulename+":{");
            modulePosRight=buf.indexOf("}",modulePosLeft);

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public static void main(String[] args){
        TestApp testApp=new TestApp();
        //testApp.testApiJs();
    }
}
