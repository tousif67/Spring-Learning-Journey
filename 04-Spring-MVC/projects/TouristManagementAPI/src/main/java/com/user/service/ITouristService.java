package com.user.service;

import com.user.exceptions.TouristNotFoundException;
import com.user.model.Tourist;

import java.util.List;

public interface ITouristService {

    public String registerTourist(Tourist tourist);
    public Tourist fetchTouristById(Integer id) throws TouristNotFoundException;
    public List<Tourist> fetchAllTouristInfo();
    public String updateTouristInfo(Tourist tourist);
    public String updateTouristBudget(Integer id,Double budget);
    public String deleteTourist(Integer id);
}
