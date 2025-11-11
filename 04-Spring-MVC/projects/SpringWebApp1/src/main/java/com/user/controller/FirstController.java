package com.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

    @RequestMapping("/welcome")
//    @GetMapping("/get")
    public ModelAndView displayResponse() {

        ModelAndView mav = new ModelAndView();
        mav.addObject("message", "Welcome to our first Web Application.");
        mav.setViewName("index");
        return mav;
    }
}
