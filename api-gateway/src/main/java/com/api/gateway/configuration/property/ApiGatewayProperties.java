package com.api.gateway.configuration.property;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@ConfigurationProperties(prefix = "api-gateway")
@Configuration("api-gatewayProperties")
@Getter
@Setter
@Lazy
public class ApiGatewayProperties {
    private String apiName;
    private String basePackage;
}
