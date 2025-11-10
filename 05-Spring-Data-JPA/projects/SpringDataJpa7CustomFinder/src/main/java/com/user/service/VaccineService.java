package com.user.service;

import com.user.entity.Vaccine;
import com.user.repo.IVaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class VaccineService implements IVaccineService{

    private IVaccineRepo repo;

    @Autowired
    public void setRepo(IVaccineRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<Vaccine> fetchByCost(Double cost) {
        return repo.findByCost(cost);
    }

    @Override
    public List<Vaccine> fetchByCostLessThan(Double cost) {
        return repo.findByCostLessThan(cost);
    }

    @Override
    public List<Vaccine> fetchByCostBetween(Double startingCost, Double endingCost) {
        return repo.findByCostBetween(startingCost,endingCost);
    }

    @Override
    public List<Vaccine> fetchByCompanyNameEquals(String name) {
        return repo.findByVaccineCompanyEquals(name);
    }

    @Override
    public List<Vaccine> fetchByVaccineNameInAndCostBetween(Collection<String> names, Double minCost, Double maxCost) {
        return repo.findByVaccineNameInAndCostBetween(names,minCost,maxCost);
    }
}

