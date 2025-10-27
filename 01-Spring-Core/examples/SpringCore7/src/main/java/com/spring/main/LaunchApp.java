package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.service.Employee;

public class LaunchApp {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");
		
		Employee emp1 = container.getBean("emp1",Employee.class);
		System.out.println(emp1);
		System.out.println(emp1.employeeTask());
		System.out.println("--------------------------");
		Employee emp2 = container.getBean("emp2",Employee.class);
		System.out.println(emp2);
		System.out.println(emp2.employeeTask());
	}
}
