package com.user.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.user.model.Employee;

@Controller
public class FormController {
	
	@GetMapping("/register")
	public String showHome() {
		return "register";
	}
	@PostMapping("/register")
	public String registerInfo(Map<String, Object> map,Employee emp) {
		System.out.println(emp);
		map.put("emp", emp);
		return "response";
	}

}
