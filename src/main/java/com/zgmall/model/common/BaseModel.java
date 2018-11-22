package com.zgmall.model.common;

import com.google.gson.annotations.SerializedName;
import org.jboss.logging.Field;

import javax.persistence.Table;



public class BaseModel {
    private String field;
    private String type;
    private int length;
    private String isnull;
    private String iskey;
    @SerializedName("default")
    private String defaultvalue;
    private String comment;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIsnull() {
        return isnull;
    }

    public void setIsnull(String isnull) {
        this.isnull = isnull;
    }

    public String getIsKey() {
        return iskey;
    }

    public void setIsKey(String iskey) {
        this.iskey = iskey;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {  this.comment = comment; }

    public String getDefaultvalue() {
        return defaultvalue;
    }

    public void setDefaultvalue(String defaultvalue) {
        this.defaultvalue = defaultvalue;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
