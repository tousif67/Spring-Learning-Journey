package main;
//class Alpha {
//	public void alpha() {
//		
//	}
//	
//}
//class Beta {
//	public void beta() {
//		Alpha a = new Alpha(); //Tightly coupled
//		a.alpha();
//	}
//}

import service.Java;
import service.SpringBoot;
import service.User;

public class LaunchApp {

	public static void main(String[] args) {
		
		//Constructor Injection
		User user = new User(new SpringBoot());//Target Class
		//Setter Injection
		user.setCourse(new Java());//Dependency Injection(DI) -> injecting dependent object into target object.
		Boolean status = user.buyTheCourse(4515.5);
		if(status) {
			System.out.println("Course enrolled Successfully");
		} else
		{
			System.out.println("Failed to Enrolled the Course");
		}
		

	}

}
