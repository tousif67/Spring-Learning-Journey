package com.user.Controller;

import com.user.Entity.Hotel;
import com.user.Service.HotelService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelService service;

    @PostMapping
    public ResponseEntity<?> createHotel(@RequestBody Hotel hotel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(hotel));
    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getHotel (@PathVariable String hotelId) {
        return ResponseEntity.status(HttpStatus.OK).body(service.get(hotelId));
    }
    //get all
    @GetMapping
    public ResponseEntity<List<Hotel>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }
}
