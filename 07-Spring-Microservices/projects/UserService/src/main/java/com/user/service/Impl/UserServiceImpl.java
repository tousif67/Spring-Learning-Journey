package com.user.service.Impl;

import com.user.service.Client.HotelClient;
import com.user.service.Client.RatingClient;
import com.user.service.Entity.Hotel;
import com.user.service.Entity.Rating;
import com.user.service.Entity.User;
import com.user.service.Exceptions.ResourceNotFoundException;
import com.user.service.Repository.UserRepo;
import com.user.service.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
   @Autowired
   private UserRepo repo;

   @Autowired
   private RatingClient ratingClient;
   @Autowired
   private HotelClient hotelClient;

    @Override
    public User saveUser(User user) {
        String randomId = UUID.randomUUID().toString();
        user.setUserid(randomId);
        return repo.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return repo.findAll();
    }

    @Override
    public User getUser(String userId) {
        List<Rating> ratingsOfUser = ratingClient.getRating(userId);

        User user = repo.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User with given id" + userId +" is not found on server !!"));

          List<Rating> ratingList = ratingsOfUser.stream().map(rating -> {
              //Api call to Hotel service to get hotel
                Hotel hotel = hotelClient.getHotel(rating.getHotelId());
                rating.setHotel(hotel);
            return rating;
        }).collect(Collectors.toList());

        user.setRatings(ratingList);
        return user;
    }
}
