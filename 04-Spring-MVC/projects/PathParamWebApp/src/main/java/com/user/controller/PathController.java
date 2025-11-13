package com.user.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class PathController {
	
	@GetMapping("/info/{name}/{course}")
	public String getSomeInfo(@PathVariable("name") String n,@PathVariable("course")String c, Map<String,Object> map) {
		String info = "Hello " + n + " I Hope you are learning something from this "+ c + " course";
		map.put("msg", info);
		return "index";
		
	}

}
