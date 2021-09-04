package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "demo.test")
@Setter
@Getter
public class DemoTestConfigs
{
    private String name;
    private Integer age;
}
