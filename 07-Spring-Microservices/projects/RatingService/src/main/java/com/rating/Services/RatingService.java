package com.rating.Services;

import com.rating.Entities.Ratings;

import java.util.List;

public interface RatingService {

    Ratings createRating (Ratings rating);

    //get all ratings
    List<Ratings> getAllRatings();
    //get all by UserId
    List<Ratings> getRatingByUserId (String userId);
    //get all by hotel
    List<Ratings> getRatingByHotelId(String hotelId);

}
