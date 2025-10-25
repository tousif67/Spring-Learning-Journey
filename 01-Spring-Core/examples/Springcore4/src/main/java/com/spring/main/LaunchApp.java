package com.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.main.service.Password;

import org.springframework.context.ApplicationContext;

public class LaunchApp {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");
		Password p = container.getBean(Password.class);
		p.passwordAlgoUsed();
		
	}
}
