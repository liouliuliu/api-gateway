package org.liuhf.core;

import lombok.Data;

/**
 * @author: lhf
 * @date: 2023/10/21 17:36
 * @description
 */
@Data
public class Config {
    
    private int port = 8888;

    /**
     * 服务名称
     */
    private String applicationName = "api-gateway";

    /**
     * 注册地址
     */
    private String registryAddress = "127.0.0.1:8848";

    /**
     * 环境配置
     */
    private String env = "dev";

    /**
     * netty boss线程
     */
    private int eventLoopGroupBossNum = 1;

    /**
     * 工作线程
     */
    private int eventLoopGroupWokerNum = Runtime.getRuntime().availableProcessors();
    
    private int maxContentLength = 64 * 1024 * 1024;

    /**
     * 默认单异步模式
     */
    private boolean whenComplete = true;

    //	Http Async 参数选项：

    //	连接超时时间
    private int httpConnectTimeout = 30 * 1000;

    //	请求超时时间
    private int httpRequestTimeout = 30 * 1000;

    //	客户端请求重试次数
    private int httpMaxRequestRetry = 2;

    //	客户端请求最大连接数
    private int httpMaxConnections = 10000;

    //	客户端每个地址支持的最大连接数
    private int httpConnectionsPerHost = 8000;

    //	客户端空闲连接超时时间, 默认60秒
    private int httpPooledConnectionIdleTimeout = 60 * 1000;

    //扩展.......
    
    
}
