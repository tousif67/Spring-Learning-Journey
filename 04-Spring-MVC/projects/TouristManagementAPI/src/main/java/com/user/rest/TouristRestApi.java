package com.user.rest;

import com.user.exceptions.TouristNotFoundException;
import com.user.model.Tourist;
import com.user.service.ITouristService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TouristRestApi {
    @Autowired
    private ITouristService service;
    @PostMapping("/regTourist")
    public ResponseEntity<String> registerTourist(@RequestBody Tourist tourist) {
        String resp = service.registerTourist(tourist);
        return new ResponseEntity<>(resp, HttpStatus.CREATED);
    }

    @GetMapping("/getTourist/{id}")
    public ResponseEntity<?> getTouristById(@PathVariable("id") Integer id) {
        try {
            Tourist resp = service.fetchTouristById(id);
            return new ResponseEntity<>(resp, HttpStatus.OK);
        } catch (TouristNotFoundException e) {
            return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/getAllTourist")
    public ResponseEntity<?> getAllTouristInfo() {
        try {
            List<Tourist> resp = service.fetchAllTouristInfo();
            return new ResponseEntity<List>(resp, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>("Some problem occurred while fetching.",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/updateTourist")
    public ResponseEntity<?> updateTouristInfo(@RequestBody Tourist tourist) {
        try {
            String resp = service.updateTouristInfo(tourist);
            return new ResponseEntity<String>(resp, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }

    @PatchMapping("/updateTouristBudget/{id}/{budget}")
    public ResponseEntity<?> updateTouristBudget(@PathVariable("id") Integer id,@PathVariable("budget") Double budget) {
        try {
            String resp = service.updateTouristBudget(id,budget);
            return new ResponseEntity<String>(resp, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/deleteTourist/{id}")
    public ResponseEntity<?> removeTourist(@PathVariable("id") Integer id) {
        try {
            String resp = service.deleteTourist(id);
            return new ResponseEntity<String>(resp, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }


}
