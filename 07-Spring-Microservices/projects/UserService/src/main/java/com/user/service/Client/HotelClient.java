package com.user.service.Client;

import com.user.service.Entity.Hotel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Hotel-Service")
public interface HotelClient {
    @GetMapping("/hotels/{hotelId}  ")
    Hotel getHotel(@PathVariable("hotelId") String hotelId);
}
