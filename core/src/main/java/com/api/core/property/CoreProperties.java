package com.api.core.property;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@ConfigurationProperties(prefix = "core")
@Configuration("coreProperties")
@Getter
@Setter
@Lazy
public class CoreProperties {
    private String apiName;
}
