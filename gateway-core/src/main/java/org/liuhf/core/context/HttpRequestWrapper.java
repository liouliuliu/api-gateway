package org.liuhf.core.context;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.FullHttpRequest;
import lombok.Data;

/**
 * @author: lhf
 * @date: 2023/10/21 23:20
 * @description 请求包装类
 */
@Data
public class HttpRequestWrapper {
    
    private FullHttpRequest fullHttpRequest;

    private ChannelHandlerContext ctx;
}
