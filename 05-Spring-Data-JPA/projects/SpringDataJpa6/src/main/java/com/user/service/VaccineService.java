package com.user.service;

import com.user.repo.IVaccineRepo;
import com.user.view.ResultView1;
import com.user.view.View;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccineService implements IVaccineService{

    private IVaccineRepo repo;

    @Autowired
    public void setRepo(IVaccineRepo repo) {
        this.repo = repo;
    }

    @Override
    public <T extends View> List<T> fetchByCostLessThan(Double cost, Class<T> cls) {
        return repo.findByCostLessThan(cost,cls);
    }
}

