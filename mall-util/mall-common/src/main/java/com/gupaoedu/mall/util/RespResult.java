package com.gupaoedu.mall.util;

import java.io.Serializable;

/**
 * 统一响应结果封装类
 * 用于封装API接口的统一响应格式，包含状态码、消息和数据
 * 
 * @param <T> 响应数据的类型
 * @author gupaoedu
 * @version 1.0
 * @since 2024
 */
public class RespResult<T> implements Serializable {

    /**
     * 响应数据结果集
     */
    private T data;

    /**
     * 状态码
     * 20000 操作成功
     * 50000 操作失败
     * 50001 系统错误
     */
    private Integer code;

    /**
     * 响应信息
     */
    private String message;

    /**
     * 无参构造函数
     */
    public RespResult() {
    }

    /**
     * 根据响应状态码构造响应结果
     * 
     * @param resultCode 响应状态码枚举
     */
    public RespResult(RespCode resultCode) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
    }

    /**
     * 根据数据和响应状态码构造响应结果
     * 
     * @param data 响应数据
     * @param resultCode 响应状态码枚举
     */
    public RespResult(T data, RespCode resultCode) {
        this.data = data;
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
    }
    
    /**
     * 创建成功响应结果（无数据）
     * 
     * @return 成功响应结果
     */
    public static RespResult ok() {
        return new RespResult(null, RespCode.SUCCESS);
    }

    /**
     * 创建成功响应结果（带数据）
     * 
     * @param data 响应数据
     * @return 成功响应结果
     */
    public static RespResult ok(Object data) {
        return new RespResult(data, RespCode.SUCCESS);
    }

    /**
     * 创建失败响应结果（使用默认错误消息）
     * 
     * @return 失败响应结果
     */
    public static RespResult error() {
        return new RespResult(null, RespCode.ERROR);
    }

    /**
     * 创建失败响应结果（自定义错误消息）
     * 
     * @param message 自定义错误消息
     * @return 失败响应结果
     */
    public static RespResult error(String message) {
        return secByError(RespCode.ERROR.getCode(), message);
    }

    /**
     * 创建自定义错误响应结果
     * 
     * @param code 自定义状态码
     * @param message 自定义错误消息
     * @return 自定义错误响应结果
     */
    public static RespResult secByError(Integer code, String message) {
        RespResult err = new RespResult();
        err.setCode(code);
        err.setMessage(message);
        return err;
    }

    /**
     * 根据响应状态码创建错误响应结果
     * 
     * @param resultCode 响应状态码枚举
     * @return 错误响应结果
     */
    public static RespResult error(RespCode resultCode) {
        return new RespResult(resultCode);
    }

    /**
     * 获取响应数据
     * 
     * @return 响应数据
     */
    public T getData() {
        return data;
    }

    /**
     * 设置响应数据
     * 
     * @param data 响应数据
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * 获取状态码
     * 
     * @return 状态码
     */
    public Integer getCode() {
        return code;
    }

    /**
     * 设置状态码
     * 
     * @param code 状态码
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * 获取响应信息
     * 
     * @return 响应信息
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置响应信息
     * 
     * @param message 响应信息
     */
    public void setMessage(String message) {
        this.message = message;
    }
}