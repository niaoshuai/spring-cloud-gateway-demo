package ren.shuaipeng.gateway.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean("ipKeyResolver")
    public IpKeyResolver ipKeyResolver() {
        return new IpKeyResolver();
    }
}
