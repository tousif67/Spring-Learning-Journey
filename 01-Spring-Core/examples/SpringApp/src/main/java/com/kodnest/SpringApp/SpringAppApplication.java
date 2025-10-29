package com.kodnest.SpringApp;

import com.kodnest.SpringApp.service.GreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication//Component Scanning
public class SpringAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container =  SpringApplication.run(SpringAppApplication.class, args);
		 GreetingService greet = container.getBean(GreetingService.class);
		System.out.println(greet.generateWish("Babulal"));
		container.close();
	}

}
