package com.spring.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class SpringBoot implements ICourse
{
	public SpringBoot() {
		System.out.println("SpringBoot Bean created.");
	}

	@Override
	public Boolean getCourse(double amount) {
		System.out.println("SpringBoot course is purchased and fees is paid " + amount);
		return true;
	}
 
}