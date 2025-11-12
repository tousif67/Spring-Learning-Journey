package com.user.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//import com.user.service.GreetingService;
import com.user.service.IGreetings;
@Controller
public class GreetingController {
	@Autowired
	private IGreetings service;
	
	
	@GetMapping("/greet")
	public String generateWish(Map<String,Object> map) {
		System.out.println("Hello Firends");
		String msg = service.generateWish("Tousif");
		map.put("wish",msg);
	
		
		return "greeting";
	}

}
