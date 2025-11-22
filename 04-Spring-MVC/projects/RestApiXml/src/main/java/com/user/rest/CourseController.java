package com.user.rest;

import com.user.model.Course;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CourseController {

    @PostMapping(value = "/add-course", consumes = {"application/xml", "application/json"})
    public ResponseEntity<String> addTheCourse(@RequestBody Course course) {
        System.out.println(course);
        String msg = "Course info added";
        return new ResponseEntity<String>(msg, HttpStatus.CREATED);
    }

    @GetMapping(value = "/get-course", produces = {"application/xml", "application/json"})
    public ResponseEntity<Course> getCourseInfo() {
        Course course = new Course(1,"SpringBoot with Java","6 months",5000.65);
        return new ResponseEntity<Course>(course, HttpStatus.OK);
    }
}
