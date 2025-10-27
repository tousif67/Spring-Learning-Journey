package com.user.main.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.user"})
public class JavaConfig {
	public JavaConfig() {
		System.out.println("Java Config bean Created");
	}
}
