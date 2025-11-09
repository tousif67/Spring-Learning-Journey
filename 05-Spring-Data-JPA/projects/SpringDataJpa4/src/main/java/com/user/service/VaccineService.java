package com.user.service;

import com.user.entity.Vaccine;
import com.user.repo.IVaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
    public Vaccine searchVaccinebyId(Integer id) {
        return repo.getReferenceById(id);
    }

    @Override
    public List<Vaccine> searchVaccinebygivenInfo(Vaccine vac) {
        Example<Vaccine> example = Example.of(vac);
        return repo.findAll(example);
    }

    @Override
    public String removeVaccineInfoByIds(Iterable<Integer> ids) {
       List<Vaccine> list =  repo.findAllById(ids);
       if (list.size() != 0) {
           repo.deleteAllByIdInBatch(ids);
           return "Records deleted for given ids";
       }
        return "Unable to delete records";
    }
}

