package com.pwx.spring.result;

/**
 * Created by pengweixiang on 2018/10/1.
 * 返回类型枚举类
 */
public enum ResultStatusEnum {

    // 系统错误
    UNKNOW_ERROR(-1, "Unknow error"),
    INTERNAL_ERROR(100500, "Internal error"),

    // 200成功
    SUCCESS(200, "Success"),

    // 400异常
    USER_NOT_FOUND(404001, "User is not exist")
    ;

    private Integer status;

    private String message;

    ResultStatusEnum(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}