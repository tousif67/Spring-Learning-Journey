package com.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.user.model.Course;

@Controller
public class CourseController {
	
	@GetMapping("/courseInfo")
	public String courseInfo(Model model) {
		model.addAttribute("cid", "T1");
		model.addAttribute("cname", "Java with SpringBoot");
		model.addAttribute("price", "6000.55");
		
		return "Course";
	}
//	@GetMapping("/courseDetail")
//	public String courseDetails(Model model) {
//		Course course = new Course();
//		course.setId(1);
//		course.setCname("Devops with AWS");
//		course.setPrice(7000.65);
//		
//		model.addAttribute("course", course);
//		
//		return "courseInfo";
//	}
	@GetMapping({"/courseDetail","/info","/object"})
	public String courseDetails(Model model) {
		Course course = new Course();
		course.setId(1);
		course.setCname("Devops with AWS");
		course.setPrice(7000.65);
		
		model.addAttribute("course", course);
		
		return "courseInfo";
	}

}
