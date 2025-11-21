package com.user.service;

import com.user.dao.ITouristRepo;
import com.user.exceptions.TouristNotFoundException;
import com.user.model.Tourist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.OpAnd;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TouristService implements ITouristService{
    @Autowired
    private ITouristRepo repo;
    @Override
    public String registerTourist(Tourist tourist) {
        Tourist tour = repo.save(tourist);
        return "Tourist Info registered with id " + tour.getId();
    }

    @Override
    public Tourist fetchTouristById(Integer id) throws TouristNotFoundException {

//        Optional<Tourist> optional repo.findById(id);
//        if(optional.isPresent())
//            return optional.get();
//        else
//            throw new TouristNotFoundException("Tourist with given id not found");

        //Better way write the code
        return repo.findById(id).orElseThrow(() ->new TouristNotFoundException("Tourist with given id is not found"));
    }

    @Override
    public List<Tourist> fetchAllTouristInfo() {
        return repo.findAll();
    }

    @Override
    public String updateTouristInfo(Tourist tourist) {
       Optional<Tourist> optional = repo.findById(tourist.getId());
       if (optional.isPresent()) {
           repo.save(tourist);
           return "Tourist info updated successfully";
       }
        throw new TouristNotFoundException("Tourist with given info not found for updation");
    }

    @Override
    public String updateTouristBudget(Integer id, Double budget) {
        Optional<Tourist> optional = repo.findById(id);
        if (optional.isPresent()) {
            Tourist tourist = optional.get();
            tourist.setBudget(budget);
            repo.save(tourist);
            return "Tourist info updated successfully";
        } else {
            throw new TouristNotFoundException("Tourist with given info not found for updation");
        }
    }

    @Override
    public String deleteTourist(Integer id) {
         Optional<Tourist> optional= repo.findById(id);
         if (optional.isPresent()) {
             repo.deleteById(id);
             return "Tourist Info deleted successfully";
         }else {
             throw new TouristNotFoundException("Tourist with given info not found for deletion");
         }
    }
}
