package com.user;

import com.user.service.ICourse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RestApiApp1Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext container = SpringApplication.run(RestApiApp1Application.class, args);
		ICourse course = container.getBean(ICourse.class);
		course.getTheCourse(5000.26);
	}

}
