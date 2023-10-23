package org.liuhf.core.request;

import io.netty.handler.codec.http.cookie.Cookie;
import org.asynchttpclient.Request;

/**
 * @author: lhf
 * @date: 2023/10/19 21:35
 * @description 提供可修改的 Request 参数操作接口
 */
public interface IGatewayRequest {

    /**
     * 修改目标服务主机
     * @param host 地址
     */
    void setModifyHost(String host);

    /**
     * 获取目标服务主机
     */
    String getModifyHost();

    /**
     * 设置目标服务请求路径
     * @param path 路径
     */
    void setModifyPath(String path);

    /**
     * 获取目标服务请求路径
     */
    String getModifyPath();

    /**
     * 添加请求头信息
     * @param header
     * @param value
     */
    void addHeader(CharSequence header,String value);

    /**
     * 设置请求头信息
     * @param header
     * @param value
     */
    void setHeader(CharSequence header,String value);

    /**
     * 添加 get 请求参数
     */
    void addQueryParam(String name,String value);

    /**
     * 添加表单请求参数
     */
    void addFormParam(String name,String value);

    /**
     * 添加或者替换 Cookie
     */
    void addOrReplaceCookie(org.asynchttpclient.cookie.Cookie cookie);

    /**
     * 设置超时时间
     * @param requestTimeout 超时时间
     */
    void setRequestTimeout(int requestTimeout);

    /**
     * 获取最终的请求路径，包含请求参数
     */
    String getFinalUrl();
    
    Request build();
}
