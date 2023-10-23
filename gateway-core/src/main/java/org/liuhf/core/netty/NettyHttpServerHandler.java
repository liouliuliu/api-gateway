package org.liuhf.core.netty;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.codec.http.FullHttpRequest;
import org.liuhf.core.context.HttpRequestWrapper;
import org.liuhf.core.netty.processor.NettyProcessor;

/**
 * @author: lhf
 * @date: 2023/10/21 22:41
 * @description
 */
public class NettyHttpServerHandler extends ChannelInboundHandlerAdapter {
    
    private final NettyProcessor nettyProcessor;

    public NettyHttpServerHandler(NettyProcessor nettyProcessor) {
        this.nettyProcessor = nettyProcessor;
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        FullHttpRequest request = (FullHttpRequest) msg;
        // 包装器封装
        HttpRequestWrapper wrapper = new HttpRequestWrapper();
        wrapper.setFullHttpRequest(request);
        wrapper.setCtx(ctx);
        // 逻辑委托
        nettyProcessor.processor(wrapper);
        
    }
    
}
