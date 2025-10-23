package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.User;

import org.springframework.context.ApplicationContext;

public class LaunchApp {

	public static void main(String[] args) {
		
		//IoC using Application context -> Eager Initialization(create beans and keep it in the container whether you use it or not). || It can use multiple xml files using per container
		ApplicationContext container =  new ClassPathXmlApplicationContext("applicationconfig.xml");
//		User user = container.getBean(User.class);
//		Boolean status = user.buyTheCourse(4585.56);
//		if(status) {
//			System.out.println("Course purchased successfully");
//		} else {
//			System.out.println("Course purchased failed");
//		}
	}

}
