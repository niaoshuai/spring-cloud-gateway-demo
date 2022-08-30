package ren.shuaipeng.gateway.demo;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;
import ren.shuaipeng.gateway.common.util.IpUtils;

/**
 * IP限流Key解析
 */
public class IpKeyResolver implements KeyResolver {

    @Override
    public Mono<String> resolve(ServerWebExchange exchange) {
        return Mono.just(IpUtils.getAddressByNginx(exchange.getRequest()));
    }
}
