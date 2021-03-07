package org.example.child.api;

/**
 * 结果响应状态码
 *
 * @author shichao
 * @since 1.0.0
 * 2021/3/6 23:17
 */
public enum ResultCode {
    SUCCESS(200, "SUCCESS"),
    BAD_REQUEST(400, "bad request"),
    NOT_FOUND(404, "not found"),
    SYSTEM_ERROR(500, "system error");

    private int code;
    private String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
