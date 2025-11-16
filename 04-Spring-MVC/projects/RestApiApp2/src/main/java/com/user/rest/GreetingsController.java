package com.user.rest;

import com.user.service.IGreetings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//restController => controller + responseBody
@RestController
@RequestMapping("/api") //If I have multiple controller classes then it is recommended to use class level annotations.
public class GreetingsController {
    @Autowired
    private IGreetings greetings;

    @GetMapping("/greet")
    public ResponseEntity<String> getWishes() {
       String res = greetings.generateWish("Tousif");
       return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @GetMapping("/greet1")
    public String getWishes2() {
        String res = greetings.generateWish("Tousif");
        return res;
    }
}
