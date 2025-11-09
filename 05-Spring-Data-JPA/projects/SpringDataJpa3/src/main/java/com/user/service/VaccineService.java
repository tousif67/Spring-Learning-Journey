package com.user.service;

import com.user.entity.Vaccine;
import com.user.repo.IVaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Iterable<Vaccine> fetchDetailsBySorting(boolean status, String... prop) {
       Sort sort = Sort.by(status? Sort.Direction.ASC: Sort.Direction.DESC, prop);
        return repo.findAll(sort);
    }

    @Override
    public List<Vaccine> fetchDetailsByPagination(int pgNo, int pgSize, boolean status, String... prop) {
        Sort sort = Sort.by(status? Sort.Direction.ASC: Sort.Direction.DESC, prop);
        PageRequest pageable = PageRequest.of(pgNo,pgSize,sort);
        Page<Vaccine> page = repo.findAll(pageable);
        return page.getContent();
    }

    @Override
    public void fetchDetailsByPagination(int pgSize) {
        long count = 8l;
        long pageCount = count/pgSize;

        pageCount = count%pgSize==0?pageCount:++pageCount;
        for (int i =0;i <pageCount;i++) {
            PageRequest pageable = PageRequest.of(i, pgSize);
            Page<Vaccine> page = repo.findAll(pageable);
            page.getContent().forEach(v -> System.out.println(v.getVaccineName() + " " + v.getVaccineCompany()));
            System.out.println("----------------------------------------------");
        }
    }
}
