package com.user.rest;

import com.user.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api1")
public class StudentController {
    @GetMapping("/info1")
    public ResponseEntity<Student> getInfo() {
        Student st = new Student(1,"Jelly","Mumbai");
        return new ResponseEntity<>(st, HttpStatus.OK);
    }

    @GetMapping("/info2")
    public Student getInfo2() {
        Student st = new Student(1,"Jelly","Mumbai");
        return st;
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student) {
        System.out.println(student);
        return "data saved";
    }

}
