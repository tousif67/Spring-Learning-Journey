package com.user.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QueryController {
	
	@GetMapping("/info")
	public String getSomeInfo(@RequestParam("name") String n,String c, Map<String,Object> map) {
		String info = "Hello " + n + " I Hope you are learning something from this "+ c + " course";
		map.put("msg", info);
		return "index";
		
	}

}
