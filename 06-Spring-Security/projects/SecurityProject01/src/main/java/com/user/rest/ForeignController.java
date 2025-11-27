package com.user.rest;

import com.user.model.Foreign;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class ForeignController {

    List<Foreign> list = new ArrayList<>(List.of(new Foreign(1,"Rohan","Kolkata")
            ,new Foreign(2,"Tousif","Noida"),new Foreign(3,"Soham","Pune")));

    @GetMapping("/get-list")
    public List<Foreign> getList() {
        return list;
    }
    @PostMapping("/add-foreign")
    public ResponseEntity<String> addForeign(@RequestBody Foreign foreign) {
        list.add(foreign);
        String msg = "Added";
        return new ResponseEntity<String>(msg, HttpStatus.OK);
    }

    @GetMapping("/get-info")
    public ResponseEntity<String> getInfo(HttpServletRequest request) {

        String msg = "The course is available and session id : " + request.getSession().getId();
        return new ResponseEntity<String>(msg, HttpStatus.OK);
    }
    @GetMapping("/get-more-info")
    public ResponseEntity<String> getMoreInfo(HttpServletRequest request) {
        String msg = "Hello your session id : " + request.getSession().getId();
        return new ResponseEntity<String>(msg, HttpStatus.OK);
    }
}
