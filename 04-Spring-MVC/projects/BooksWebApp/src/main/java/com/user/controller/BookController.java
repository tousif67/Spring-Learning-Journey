package com.user.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
	@GetMapping("/home")
	public String showHomePage() {
		return "index";
	}
	
	@GetMapping("/info")
	public String getBooksInfo(Map<String,Object> map) {
		String[] bookNames = new String[] {"Java ", " SpringBoot ", " Hibernate"};
		
		map.put("books", bookNames);
		return "response";
	}

}
