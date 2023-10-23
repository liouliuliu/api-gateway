package org.liuhf.core;

/**
 * @author: lhf
 * @date: 2023/10/21 19:04
 * @description
 */
public interface LifeCycle {

    /**
     * 初始化
     */
    void init();

    /**
     * 启动
     */
    void start();

    /**
     * 关闭
     */
    void shutdown();
}

