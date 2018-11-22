package com.gene.common.util.exception;

public class RestException extends Exception {
    private  int code;
    public RestException(String message, int code) {
        super(message);
        this.code = code;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
}