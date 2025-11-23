package com.user.rest;

import com.user.model.Student;
import com.user.service.IGreetings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController

public class GreetingsController {
    @Autowired
    private IGreetings greetings;

    @GetMapping("/greet")
    public ResponseEntity<String> getWishes() {
       String res = greetings.generateWish("Tousif");
       return new ResponseEntity<String>(res, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addStudent(@RequestBody Student student) {
        System.out.println(student);
        Boolean status = greetings.addStudent(student);
        if (status) {
            String msg = "Student data added";
            return new ResponseEntity<String>(msg, HttpStatus.CREATED);
        } else {
            String msg = "Student data not added";
            return new ResponseEntity<String>(msg, HttpStatus.CREATED);
        }
    }
}
