package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.User;

import org.springframework.context.ApplicationContext;

public class LaunchApp {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");
		
		User u = container.getBean(User.class);
		Boolean status = u.buyTheCourse(45000);
		if(status)
			System.out.println("Course purchased successfully");
		else
			System.out.println("Course purchased Failed");
	}
}
