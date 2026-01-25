package com.user.service.Client;


import com.user.service.Entity.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "RatingService")
public interface RatingClient {

    @GetMapping("/user/{userId}")
    List<Rating> getRating(@PathVariable("userId") String userId);


}
