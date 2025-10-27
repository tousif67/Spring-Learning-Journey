package com.user.main.service;

import java.util.Date;

import org.springframework.stereotype.Service;


@Service
public class Greetings {
	public Greetings() {
		System.out.println("Greetings Bean created");
	}
	
	public String generateGreeting(String name) {
		Date date = new Date();
		int hour = date.getHours();
		if(hour < 12)	
			return "Good Morning! " + name;
		else if (hour < 16) 
			return "Good Afternoon! " + name;
		else if (hour < 20) 
			return "Good Evening! " + name;
		else
			return "Good Night! " + name;
		
	}
}
