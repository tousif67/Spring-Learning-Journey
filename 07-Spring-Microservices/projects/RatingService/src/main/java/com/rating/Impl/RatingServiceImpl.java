package com.rating.Impl;

import com.rating.Entities.Ratings;
import com.rating.Repo.RatingRepo;
import com.rating.Services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RatingServiceImpl implements RatingService {
    @Autowired
    private RatingRepo repo;

    @Override
    public Ratings createRating(Ratings rating) {
        return repo.save(rating);
    }

    @Override
    public List<Ratings> getAllRatings() {
        return repo.findAll();
    }

    @Override
    public List<Ratings> getRatingByUserId(String userId) {
        return repo.findByUserId(userId);
    }

    @Override
    public List<Ratings> getRatingByHotelId(String hotelId) {
        return repo.findByHotelId(hotelId);
    }
}
