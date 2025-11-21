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
    public ResponseEntity<Tourist> getTouristById(@PathVariable("id") Integer id) {

            Tourist resp = service.fetchTouristById(id);
            return new ResponseEntity<Tourist>(resp, HttpStatus.OK);

    }

    @GetMapping("/getAllTourist")
    public ResponseEntity<List> getAllTouristInfo() {

            List<Tourist> resp = service.fetchAllTouristInfo();
            return new ResponseEntity<List>(resp, HttpStatus.OK);

    }

    @PutMapping("/updateTourist")
    public ResponseEntity<String> updateTouristInfo(@RequestBody Tourist tourist) {

            String resp = service.updateTouristInfo(tourist);
            return new ResponseEntity<String>(resp, HttpStatus.OK);

    }

    @PatchMapping("/updateTouristBudget/{id}/{budget}")
    public ResponseEntity<String> updateTouristBudget(@PathVariable("id") Integer id,@PathVariable("budget") Double budget) {

            String resp = service.updateTouristBudget(id,budget);
            return new ResponseEntity<String>(resp, HttpStatus.OK);

    }

    @DeleteMapping("/deleteTourist/{id}")
    public ResponseEntity<String> removeTourist(@PathVariable("id") Integer id) {

            String resp = service.deleteTourist(id);
            return new ResponseEntity<String>(resp, HttpStatus.OK);

    }


}
