package ren.shuaipeng.gateway.common.util;

import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;

/**
 * IP工具类
 */
public class IpUtils {

    private static final String NGINX_IP_HEADER = "X-Real-IP";

    /**
     * 获取NGINX转发过来的用户IP 需要NGINX转发X-Real-IP
     *
     * @param request
     * @return
     */
    public static String getAddressByNginx(ServerHttpRequest request) {
        HttpHeaders headers = request.getHeaders();
        return headers.getFirst(NGINX_IP_HEADER);
    }
}
