package com.user.SpringBoot3;

import com.user.SpringBoot3.service.Amazon;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot3Application {

	public static void main(String[] args) {

	ConfigurableApplicationContext container = SpringApplication.run(SpringBoot3Application.class, args);
		int count = container.getBeanDefinitionCount();
		String[] names = container.getBeanDefinitionNames();

		System.out.println(count);
		System.out.println("All bean Names are : " );
		for(String x : names) {
			System.out.println(x);
		}

		Amazon amz = container.getBean(Amazon.class);
		Boolean status = amz.deliverProduct(5456.45);
		if (status)
			System.out.println("Product Delivery Successfully");
		else
			System.out.println("Product Delivery Failed");

	}
}
