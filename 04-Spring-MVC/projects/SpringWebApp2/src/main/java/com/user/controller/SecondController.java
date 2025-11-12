package com.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user2")
public class SecondController {

    @GetMapping("/welcome")
    public String displayResponse2(Model model) {
    	System.out.println("Model is internally implementing " + model.getClass().getName());
    	model.addAttribute("msg", "Lets Go And Find Rocks Pirate");
        return "index";
    }
}
