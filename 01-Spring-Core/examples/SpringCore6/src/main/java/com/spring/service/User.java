package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class User {
//	@Autowired
	private ICourse course;
	public User() {
		super();
		System.out.println("Telusko Bean Created");
	}
//	@Autowired
//	
//	public User(@Qualifier("java")ICourse course) {
//		super();
//		System.out.println("Constructor Injection");
//		this.course = course;
//	}
	@Autowired
	@Qualifier("java")
	public void setCourse(ICourse course) {
		System.out.println("Setter Injection");
		this.course = course;
	}
	
	public Boolean buyTheCourse(double amount) {
		return course.getCourse(amount);
	}
	

}