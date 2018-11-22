package com.zgmall.base.util;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

import java.util.Date;
import java.util.Vector;
import java.util.StringTokenizer;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.*;

public class DateHelper {
  public DateHelper() {
  }

  public static String DATE_FORMAT = "yyyy'-'MM'-'dd";
  public static String TIME_FORMAT = "HH:mm:ss ";

  public static String formatDate(Date aValue) {
    if (aValue == null) {
      return ""; // in order to deal with null object
    }

    DateFormat vFormat = new SimpleDateFormat(DATE_FORMAT);
    return vFormat.format(aValue);
  }

  public static String dateAdd(String interval,int count,String dateStr)throws Exception{

      if(dateStr==null||dateStr.equals("")) return "";
      Calendar cl=Calendar.getInstance();
      Date d1 = getDate(dateStr);
      cl.setTime(d1);
      if(interval.equalsIgnoreCase("y")){
        cl.add(cl.YEAR,count);
      }else if(interval.equalsIgnoreCase("m")){
        cl.add(cl.MONTH,count);
      }else if(interval.equalsIgnoreCase("d")){
        cl.add(cl.DAY_OF_MONTH,count);
      }else{
        throw new Exception("�����������Ͳ��ԣ�");
      }
      Date d2=cl.getTime();

      return formatDate(d2);
    }

  /**
   * DateFormat
   * @return
   * ��ȡ���ڸ�ʽ��2004-01-01
   */
  public static String formatDate() {
    Date today = new Date();
    DateFormat vFormat = new SimpleDateFormat(DATE_FORMAT);
    return vFormat.format(today);
  }

  /**
   *
   * @param aValue
   * @return
   * ��ȡ���ڸ�ʽ��2004-01-01 00��00��01
   */
  public static String formatDateTime(Date aValue) {
    if (aValue == null) {
      return ""; // in order to deal with null object
    }

    DateFormat vFormat = new SimpleDateFormat(DATE_FORMAT + " " + TIME_FORMAT);
    return vFormat.format(aValue);
  }

  /**
   * ���ز�ͬ�ָ�ʽ������
   * @param args
   * ��ȡ���ڸ�ʽ��2004��1��31��
   */
  public static String formatCDate() {
    Date today = new Date();
    DateFormat vFormat = DateFormat.getDateInstance(DateFormat.LONG);
    return vFormat.format(today);
  }
  /**
  * ���ز�ͬ�ָ�ʽ������
  * @param args
  * ��ȡ���ڸ�ʽ��2004��6��23�� ������
  */
 public static String formatCDay() {
   Date today = new Date();
   DateFormat vFormat = DateFormat.getDateInstance(DateFormat.FULL);
   return vFormat.format(today);
 }

  public static String foramteDate(String aValue) throws Exception{
    if( aValue == null||aValue.equals("")) return "";

    SimpleDateFormat vFormat = new SimpleDateFormat(DATE_FORMAT);
    Date sDate=vFormat.parse(aValue);
    return vFormat.format(sDate);
  }

  public static Date getDate(String aValue) throws Exception{
    if( aValue == null||aValue.equals("")) return null;
    SimpleDateFormat vFormat = new SimpleDateFormat(DATE_FORMAT);
    Date sDate=vFormat.parse(aValue);
    return sDate;
  }

  public static Date getDateTime(String aValue) throws Exception{
    if( aValue == null||aValue.equals("")) return null;
    SimpleDateFormat vFormat = new SimpleDateFormat(DATE_FORMAT + " " + TIME_FORMAT);
    Date sDate=vFormat.parse(aValue);
    return sDate;
  }


  public static String getPreYearLastDay(String aValue)throws Exception{
     if( aValue == null||aValue.equals("")) return "";
     Date d0=getDate(aValue);
     d0.setDate(31);
     d0.setMonth(11);
     d0.setYear(d0.getYear()-1);
     return formatDate(d0);

  }

  public static String getPreMonthLastDay(String aValue)throws Exception{
     if( aValue == null||aValue.equals("")) return "";
     Date d0=getDate(aValue);
     d0.setDate(1);
     d0.setDate(d0.getDate()-1);
     return formatDate(d0);

  }

  public static String compare(Date date){
      Date startDate = new Date(-1, 11, 31);
      long d1 = date.getTime();
      System.out.println(d1);
      long d2 = startDate.getTime();
      System.out.println(d2);
      long d3 = d1 - d2;
      d3 /= 0x5265c00L;
      Long d4 = new Long(d3);
      String d5 = d4.toString();
      return d5;
  }

  public static String compareLong(long day){
      Date startDate = new Date(-1, 11, 31);
      long d1 = startDate.getTime();
      day *= 0x5265c00L;
      long d2 = d1 + day;
      Date d = new Date();
      d.setTime(d2);
      SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
      String s = df.format(d);
      return s;
  }

  public static Date valueOf(String s){
      if(s == null)
          throw new IllegalArgumentException();
      int firstDash = s.indexOf(45);
      int secondDash = s.indexOf(45, firstDash + 1);
      int year;
      int month;
      int day;
      if((firstDash > 0) & (secondDash > 0) & (secondDash < s.length() - 1)){
          year = Integer.parseInt(s.substring(0, firstDash));
          month = Integer.parseInt(s.substring(firstDash + 1, secondDash));
          day = Integer.parseInt(s.substring(secondDash + 1));
      }else{
          throw new IllegalArgumentException();
      }
      System.out.println("year :" + year + ", month:" + month + ", day:" + day);
      return new Date(year - 1900, month - 1, day);
  }


  public static void main(String[] args) throws Exception{

    String t1="2003-5-1";
    System.out.println(getPreYearLastDay(t1));
    System.out.println(getPreMonthLastDay(t1));
//     DateHelper dhp=new DateHelper();
//      Date today=new Date();
//      String s="2004-06-11";
//
//      SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
//      try {
//        Date fDate = df.parse("2004-06-188");
//       s=df.format(fDate);
//      }catch (ParseException ex) {
//        ex.printStackTrace();
//      }

//      System.out.println("d:"+Date.parse(s));
//     String da=dhp.formatDateTime(fDate);
//     System.out.println("dates:"+da);
    /////
    /*
    Date now = new Date();

    DateFormat df = DateFormat.getDateInstance();
    DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
    DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
    DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
    DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);
    String s = df.format(now);
    String s1 = df1.format(now);
    String s2 = df2.format(now);
    String s3 = df3.format(now);
    String s4 = df4.format(now);

    System.out.println("(Default) Today is " + s);
    System.out.println("(SHORT)   Today is " + s1);
    System.out.println("(MEDIUM)  Today is " + s2);
    System.out.println("(LONG)    Today is " + s3);
    System.out.println("(FULL)    Today is " + s4);
//     Date now = new Date();
//
//      DateFormat defaultFormat = DateFormat.getDateTimeInstance();
//      DateFormat shortFormat = DateFormat.getDateTimeInstance (DateFormat.SHORT,DateFormat.SHORT);
//      DateFormat mediumFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
//      DateFormat longFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
//      DateFormat fullFormat = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
//      String defaultDate = defaultFormat.format(now);
//      String shortDate = shortFormat.format(now);
//      String mediumDate = mediumFormat.format(now);
//      String longDate = longFormat.format(now);
//      String fullDate = fullFormat.format(now);
//
//      System.out.println("(Default) Today :" + defaultDate);
//      System.out.println("(SHORT) Today : " + shortDate);
//      System.out.println("(MEDIUM) Today :" + mediumDate);
//      System.out.println("(LONG) Today : " + longDate);
//      System.out.println("(FULL) Today : " + fullDate);
//
*/
  }
}
