package com.itachi.entities;



/**
 * @auther zzyy
 * @create 2020-02-18 17:23
 */
//该类用于封装操作结果集返回给前端，包括状态码，成功（或者错误信息），操作类的信息
public class CommonResult<T>
{
    private Integer code;
    private String  message;
    private T       data;

    public CommonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public CommonResult(){

    }

    public CommonResult(Integer code, String message) {
        this(code,message,null);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
