package com.user.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
//@RequestMapping("/user")
public class FirstController {

//    @GetMapping("/welcome")
//    public String displayResponse2(Model model) {
////    	System.out.println("Model is internally implementing " + model.getClass().getName());
//    	model.addAttribute("msg", "Lets Go And Find OnePiece");
//        return "index";
//    }
//    @GetMapping("/skill")
//    public String displayImportantMsg(Model model) {
////    	System.out.println("Model is internally implementing " + model.getClass().getName());
//    	model.addAttribute("focus", "Focus is the most important skill.");
//        return "focus";
//    }
    @GetMapping("/user")
    public String displayImportantMsg(Map<String,Object> map) {
    	map.put("msg", "Focus is the most important skill.");
        return "index";
    }
    //we don't have to write anything in return if the endpoint and jsp file have same name,But we can't use Request-mapping in this case.
    @GetMapping("/info")
    public void displayImportantMsg2(Map<String,Object> map) {
    	map.put("info", "We will succeed Together.");
        return;
    }
}
