package com.user.rest;

import com.user.service.IGreetings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingsController {
    @Autowired
    private IGreetings greetings;

    @GetMapping("/greet")
    @ResponseBody
    public ResponseEntity<String> getWishes() {
       String res = greetings.generateWish("Tousif");
       return new ResponseEntity<>(res, HttpStatus.OK);
    }
}
