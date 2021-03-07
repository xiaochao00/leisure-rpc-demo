package org.example.child.api;

import java.io.Serializable;

/**
 * API 结果封装类
 *
 * @author shichao
 * @since 1.0.0
 * 2021/3/6 23:15
 */
public class ApiResult<T> implements Serializable {

    private static final long serialVersionUID = 8796890403749746850L;
    private Integer code;
    private String message;
    private T data;

    public static <T> ApiResult<T> success(T data) {
        ApiResult<T> apiResult = new ApiResult<>();
        apiResult.setCode(ResultCode.SUCCESS.getCode());
        apiResult.setMessage(ResultCode.SUCCESS.getMsg());
        apiResult.setData(data);
        return apiResult;
    }

    public static <T> ApiResult<T> error(ResultCode resultCode) {
        ApiResult<T> apiResult = new ApiResult<>();
        apiResult.setCode(resultCode.getCode());
        apiResult.setMessage(resultCode.getMsg());
        return apiResult;
    }

    public static <T> ApiResult<T> error(ResultCode resultCode, String message) {
        ApiResult<T> apiResult = new ApiResult<>();
        apiResult.setCode(resultCode.getCode());
        apiResult.setMessage(message);
        return apiResult;
    }

    public static <T> ApiResult<T> error(String message) {
        ApiResult<T> apiResult = new ApiResult<>();
        apiResult.setCode(ResultCode.SYSTEM_ERROR.getCode());
        apiResult.setMessage(message);
        return apiResult;
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
