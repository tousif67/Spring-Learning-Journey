package com.user.rest;


import com.user.model.Alien;
import com.user.service.IAlienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlienController {
    @Autowired
    private IAlienService service;


    @PostMapping("/addAlien")
    public ResponseEntity<Alien> addAlien(@RequestBody Alien alien) {
            Alien al = service.registerAlien(alien);

            return new ResponseEntity<Alien>(al, HttpStatus.CREATED);
    }

    @GetMapping("/getAliens")
    public ResponseEntity<List> addAlien() {
        List<Alien> list = service.getAllAliensInfo();

        return new ResponseEntity<List>(list, HttpStatus.OK);
    }
}
