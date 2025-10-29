package com.kodnest.SpringApp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;

@Configuration
public class Config {
    public Config() {
        System.out.println("Config bean is created.");
    }
    @Bean
    public LocalTime createTime() {
        return LocalTime.now();
    }
}
