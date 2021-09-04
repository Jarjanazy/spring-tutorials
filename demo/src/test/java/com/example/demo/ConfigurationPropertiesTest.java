package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ConfigurationPropertiesTest
{
    @Autowired
    private DemoTestConfigs demoTestConfigs;

    @Test
    public void loadPropertiesUsingConfigurationProperties(){
        assertEquals("testName", demoTestConfigs.getName());
        assertEquals(16, demoTestConfigs.getAge());
    }
}
