package com.user.Impl;

import com.user.Entity.Hotel;
import com.user.Exceptions.ResourceNotFoundException;
import com.user.Repo.HotelRepo;
import com.user.Service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepo repo;



    public Hotel create (Hotel hotel) {
        String id = UUID.randomUUID().toString();
        hotel.setId(id);
        return repo.save(hotel);
    }
    @Override
    public List<Hotel> getAll() {
        return repo.findAll();
    }
    @Override
    public Hotel get(String id) {

        return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("hotel with given id " + id + " not found!!"));
    }
}

