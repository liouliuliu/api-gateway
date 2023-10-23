package org.liuhf.common.constants;

/**
 * @author: lhf
 * @date: 2023/10/22 21:41
 * @description
 */
public interface GatewayProtocol {

    String HTTP = "http";

    String DUBBO = "dubbo";

    static boolean isHttp(String protocol) {
        return HTTP.equals(protocol);
    }

    static boolean isDubbo(String protocol) {
        return DUBBO.equals(protocol);
    }

}
