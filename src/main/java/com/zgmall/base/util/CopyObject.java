package com.zgmall.base.util;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */
import java.lang.reflect.*;
import java.lang.Cloneable;
import java.util.*;



public class CopyObject {
  private static Object lock = new Object();
  private static CopyObject splitObject;
  public CopyObject() {
  }

  /***
   *
   */
  public static CopyObject getInstance() {
    if (splitObject == null) {
      synchronized (lock) {
        if (splitObject == null) {
          splitObject = new CopyObject();
        }
      }

    }
    return splitObject;
  }

  /**
   *
   * @param sourObj  源对象
   * @param destObj  目的对象
   * @return
   * @throws Exception
   */
  public static boolean splitObjects(Object sourObj, Object destObj) throws Exception {
    boolean result=true;
    try{

      Class sourClass = sourObj.getClass();
      Class destClass = destObj.getClass();

      Method[] methods = destClass.getDeclaredMethods();
      for (int i = 0; i < methods.length; i++) {
        Method dm = methods[i];
        String methodName = dm.getName();
        String methodValue = null;
        String methodType=methodName.substring(0, 3);

        if (methodType.equalsIgnoreCase("set")) {

          methodName = methodName.substring(3);
          try {
            //get sourObject value
            Method sm = sourClass.getDeclaredMethod("get" + methodName, null);
            methodValue = (String) sm.invoke(sourObj, null);
            //set destObject value
            if(methodValue!=null){
              //System.out.println(methodName+"--"+methodValue);
              Object[] args = {new String(methodValue)};
              dm.invoke(destObj, args);
            }
          }
          catch (Exception ex) {
            //check sourObject no this method,do nothing.
          }
        }
      }
    }catch (Exception ex) {
      result=false;
      throw ex;
    }

    return result;
  }

  public static void turnNullToSpace(Object obj)throws Exception {
  try{
    Class destClass=obj.getClass();
    Method[] methods = destClass.getDeclaredMethods();
    for (int i = 0; i < methods.length; i++) {
      Method dm = methods[i];
      String methodName = dm.getName();
      String methodValue = null;
      String methodType=methodName.substring(0, 3);

      if (methodType.equalsIgnoreCase("set")) {

        methodName = methodName.substring(3);
        try {
          //get sourObject value
          Method sm = destClass.getDeclaredMethod("get" + methodName, null);
          methodValue = (String) sm.invoke(obj, null);
          //set destObject value
          if(methodValue==null){
            //System.out.println(methodName+"--"+methodValue);
            Object[] args = {new String("")};
            dm.invoke(obj, args);
          }
        }
        catch (Exception ex) {
          //check sourObject no this method,do nothing.
        }
      }
    }
  }catch (Exception ex) {

    throw ex;
  }

  }
/*
                   columnValue = StringHelper.parsetrun(columnValue,
                    Service.getInEncodeType(),
                    Service.getOutEncodeType());
              }
*/
  public static void encodeObject(Object obj,String inEncodeType,String outEncodeType)throws Exception {
  try{
    Class destClass=obj.getClass();
    Method[] methods = destClass.getDeclaredMethods();
    for (int i = 0; i < methods.length; i++) {
      Method dm = methods[i];
      String methodName = dm.getName();
      String methodValue = null;
      String methodType=methodName.substring(0, 3);

      if (methodType.equalsIgnoreCase("set")) {

        methodName = methodName.substring(3);
        try {
          //get sourObject value
          Method sm = destClass.getDeclaredMethod("get" + methodName, null);
          methodValue = (String) sm.invoke(obj, null);
          //set destObject value
          if(methodValue!=null){
            //System.out.println(methodName+"--"+methodValue);

            Object[] args = {new String(methodValue.getBytes(inEncodeType), outEncodeType)};
            dm.invoke(obj, args);
          }
        }
        catch (Exception ex) {
          //check sourObject no this method,do nothing.
        }
      }
    }
  }catch (Exception ex) {

    throw ex;
  }

  }

  /**
   * 运行对象的方法，输入输出参数都只能为字符串(一个)
   * @param obj
   * @param methodName
   * @param inputParm
   * @flag 1:无参数有返回值  2：有参数无返回值 3：有参数有返回值
   * @return
   * @throws Exception
   */
  public static String runObjectMethod(Object obj,String methodName,String inputParm,int flag) throws Exception{
    boolean result=true;
    String outputParm=null;
    Object[] in=new Object[1];
    if (flag == 1) {
      in = null;
    }
    else {
      in[0] = inputParm;
    }

    Class destClass = obj.getClass();
    
    Method dm = null;
    //
    while (destClass!=null) {
      try{
        if (flag == 1) {
            dm = destClass.getDeclaredMethod(methodName, null);
        } else {
          Class param[] = new Class[1];
          param[0] = new String("").getClass();
          dm = destClass.getDeclaredMethod(methodName, param);
        }
        break;
      } catch (NoSuchMethodException ex) {
        //如果没找到,父类
        destClass=destClass.getSuperclass();
      }

    }
    Object rtObj=null;

    if (flag==1) {
      rtObj= dm.invoke(obj, null);
    }else if(flag==2){
      dm.invoke(obj, in);
    }else if(flag==3){
      rtObj= dm.invoke(obj, in);
    }
    if (rtObj!=null) {
      outputParm = String.valueOf(rtObj);
    }
    return outputParm;
  }

  /**
   *获取一个多项下所有的属性名称值，
   * @param obj
   * @return
   */
  public static List<String[]> getFieldAndValues(Object obj){
    List<String[]> list=new ArrayList<String[]>();
    Class tempClass=obj.getClass();
    int level = 0;
     while(true) {
       Field[] field = tempClass.getDeclaredFields();
       for (int j = 0; j < field.length; j++) {
         String name = field[j].getName();

         name = name.substring(0, 1).toUpperCase() + name.substring(1);
         String type = field[j].getGenericType().toString();
         //System.out.println(name + ":" + type);
         //if(type.equals("class java.lang.String")){
         Method m;
         String value=null;
         try {
           m = tempClass.getMethod("get" + name);
           Object tmpObj=m.invoke(obj);
           if (tmpObj!=null)  value = tmpObj.toString();
           if (value != null && !"".equals(value) && !"null".equals(value)) {
             String[] arr = new String[]{name, type,value, String.valueOf(level)};
             list.add(arr);
             //System.out.println(name+":"+value+":"+level);
           }
         } catch (Exception ex) {
           ex.printStackTrace();
         }
       }
       if (tempClass.getSuperclass() == null) return list;
       else {
         tempClass = tempClass.getSuperclass();
         level=level+1;
       }
     }
  }
  /**
   * 根据类名创建一个对象实例
   * @param classname
   * @return
   * @throws Exception
   */
  public static Object createObjectInstance(String classname) throws Exception {
    Class newinstance=Class.forName(classname);
    return newinstance.newInstance();
  }
  /**
   * 
   * @param classname
   * @return
   * @throws Exception
   */
  public static Class createClass(String classname)  {
	 Class newclass=null;
 	 try {
 		 newclass=Class.forName(classname);
 	 }catch(Exception ex){
 		 ex.printStackTrace();
 	 }
 	 return newclass;
  }

  public static void main(String[] args) {
    //com.git.base.test.testinstance tst1=new com.git.base.test.testinstance();



    try {

      Object tst1=CopyObject.createObjectInstance("com.git.base.test.testinstance");

      CopyObject.runObjectMethod(tst1, "setStr", "qvwen",2);



      System.out.println(CopyObject.runObjectMethod(tst1, "getStr", null,1));
      System.out.println(CopyObject.runObjectMethod(tst1, "getStr", "you is:",3)+CopyObject.runObjectMethod(tst1, "getStr", null,1));
    }catch(Exception ex){
      ex.printStackTrace();
    }

  }




}
