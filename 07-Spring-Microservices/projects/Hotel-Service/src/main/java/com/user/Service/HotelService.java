package com.user.Service;

import com.user.Entity.Hotel;

import java.util.List;
import java.util.UUID;

public interface HotelService {

    public Hotel create (Hotel hotel) ;
    public List<Hotel> getAll() ;


    public Hotel get(String id) ;

}
