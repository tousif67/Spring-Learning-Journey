package com.user.SpringBoot2;


import com.user.SpringBoot2.service.Alien;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot2Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext container = SpringApplication.run(SpringBoot2Application.class, args);
		Alien a = container.getBean(Alien.class);
		a.disp();
	}

}
