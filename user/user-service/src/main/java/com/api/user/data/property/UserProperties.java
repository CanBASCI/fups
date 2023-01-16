package com.api.user.data.property;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@ConfigurationProperties(prefix = "user")
@Configuration("userProperties")
@Getter
@Setter
@Lazy
public class UserProperties {
    private String apiName;
}
