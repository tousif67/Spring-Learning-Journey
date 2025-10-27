package com.user.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.user.main.config.JavaConfig;
import com.user.main.service.Greetings;

import org.springframework.context.ApplicationContext;

public class LaunchApp {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Greetings greet =  container.getBean(Greetings.class);
		System.out.println(greet.generateGreeting("Killua"));
	}

}
