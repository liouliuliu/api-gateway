package org.liuhf.core.netty.processor;

import org.liuhf.core.context.HttpRequestWrapper;

/**
 * @author: lhf
 * @date: 2023/10/21 23:23
 * @description
 */
public interface NettyProcessor {
    
    void processor(HttpRequestWrapper wrapper);
}
