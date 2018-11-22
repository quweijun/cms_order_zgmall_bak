package com.zgmall.common.util;

import com.zgmall.base.util.CopyObject;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

public class mybatisUtil {
    public static void  generateCriteria(Example.Criteria criteria, Object obj){
        CopyObject copyObject=new CopyObject();
        List<String[]> list= copyObject.getFieldAndValues(obj);
        for(int i=0;i<list.size();i++){
            String fieldname=list.get(i)[0];
            String fieldtype=list.get(i)[1];
            String fieldvalue=list.get(i)[2];
            String fieldlevel=list.get(i)[3];
            if (!fieldlevel.equals("0")) {
                String tailid=fieldname.substring(fieldname.length()-2,fieldname.length()).toLowerCase();
                if (fieldname.toLowerCase().equals("id")||tailid.equals("id")) {
                    criteria.andEqualTo(fieldname.toLowerCase(), fieldvalue);
                }
                else {
                    if (fieldtype.equals("class java.lang.String"))  criteria.andLike(fieldname.toLowerCase(), "%"+fieldvalue+"%");
                }
            }
        }
    }
}
