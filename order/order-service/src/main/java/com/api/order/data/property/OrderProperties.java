package com.api.order.data.property;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@ConfigurationProperties(prefix = "order")
@Configuration("orderProperties")
@Getter
@Setter
@Lazy
public class OrderProperties {
    private String apiName;
}
