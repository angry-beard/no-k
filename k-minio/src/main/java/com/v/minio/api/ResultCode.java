package com.v.minio.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultCode implements IResultCode {

    /**
     * 操作成功
     */
    SUCCESS(KConstant.SC_OK, "操作成功"),

    /**
     * 业务异常
     */
    FAILURE(KConstant.SC_BAD_REQUEST, "业务异常"),

    /**
     * 请求未授权
     */
    UN_AUTHORIZED(KConstant.SC_UNAUTHORIZED, "请求未授权"),

    /**
     * 404 没找到请求
     */
    NOT_FOUND(KConstant.SC_NOT_FOUND, "404 没找到请求"),

    /**
     * 消息不能读取
     */
    MSG_NOT_READABLE(KConstant.SC_BAD_REQUEST, "消息不能读取"),

    /**
     * 不支持当前请求方法
     */
    METHOD_NOT_SUPPORTED(KConstant.SC_METHOD_NOT_ALLOWED, "不支持当前请求方法"),

    /**
     * 不支持当前媒体类型
     */
    MEDIA_TYPE_NOT_SUPPORTED(KConstant.SC_UNSUPPORTED_MEDIA_TYPE, "不支持当前媒体类型"),

    /**
     * 请求被拒绝
     */
    REQ_REJECT(KConstant.SC_FORBIDDEN, "请求被拒绝"),

    /**
     * 服务器异常
     */
    INTERNAL_SERVER_ERROR(KConstant.SC_INTERNAL_SERVER_ERROR, "服务器异常"),

    /**
     * 缺少必要的请求参数
     */
    PARAM_MISS(KConstant.SC_BAD_REQUEST, "缺少必要的请求参数"),

    /**
     * 请求参数类型错误
     */
    PARAM_TYPE_ERROR(KConstant.SC_BAD_REQUEST, "请求参数类型错误"),

    /**
     * 请求参数绑定错误
     */
    PARAM_BIND_ERROR(KConstant.SC_BAD_REQUEST, "请求参数绑定错误"),

    /**
     * 参数校验失败
     */
    PARAM_VALID_ERROR(KConstant.SC_BAD_REQUEST, "参数校验失败");

    /**
     * code编码
     */
    final int code;
    /**
     * 中文信息描述
     */
    final String message;

}
