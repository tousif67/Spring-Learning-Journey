package com.rating.Controller;

import com.rating.Entities.Ratings;
import com.rating.Services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {
    @Autowired
    private RatingService service;
    //create rating
    @PostMapping("/create")
    public ResponseEntity<Ratings> create (@RequestBody Ratings rating) {
        return ResponseEntity.status (HttpStatus.CREATED).body(service.createRating(rating));
    }
    //get all
    @GetMapping("/getAll")
    public ResponseEntity<List<Ratings>> getRatings(){
        return ResponseEntity.ok(service.getAllRatings());
    }
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Ratings>> getRatingsByUserId(@PathVariable String userId){
        return ResponseEntity.ok(service.getRatingByUserId(userId));
    }

    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Ratings>> getRatingsByHotelId(@PathVariable String hotelId){
        return ResponseEntity.ok(service.getRatingByHotelId(hotelId));
    }


}
