package com.spring.main.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	public Config() {
		System.out.println("Config Bean Created.");
	}
	@Bean
	public Password createPasswordBean() {
		Password pass = new Password("Greedy");
		return pass;
	}
}
