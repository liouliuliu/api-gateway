package org.liuhf.core;

import lombok.extern.slf4j.Slf4j;
import org.liuhf.core.netty.NettyHttpClient;
import org.liuhf.core.netty.NettyHttpServer;
import org.liuhf.core.netty.processor.NettyCoreProcessor;
import org.liuhf.core.netty.processor.NettyProcessor;

/**
 * @author: lhf
 * @date: 2023/10/23 22:32
 * @description
 */
@Slf4j
public class Container implements LifeCycle{
    
    private final Config config;
    
    private NettyHttpServer nettyHttpServer;
    
    private NettyHttpClient nettyHttpClient;
    
    private NettyProcessor nettyProcessor;

    public Container(Config config) {
        this.config = config;
        init();
    }

    @Override
    public void init() {
        this.nettyProcessor = new NettyCoreProcessor();
        
        this.nettyHttpServer = new NettyHttpServer(config,nettyProcessor);
        
        this.nettyHttpClient = new NettyHttpClient(config,nettyHttpServer.getEventLoopGroupWoker());
    }

    @Override
    public void start() {
        nettyHttpServer.start();
        nettyHttpClient.start();
        log.info("api gateway started!");
    }

    @Override
    public void shutdown() {
        nettyHttpClient.shutdown();
        nettyHttpServer.shutdown();
    }
}
