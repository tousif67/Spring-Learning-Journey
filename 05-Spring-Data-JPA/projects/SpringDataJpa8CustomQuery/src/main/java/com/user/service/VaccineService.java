package com.user.service;

import com.user.entity.Vaccine;
import com.user.repo.IVaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Service
public class VaccineService implements IVaccineService{

    private IVaccineRepo repo;

    @Autowired
    public void setRepo(IVaccineRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<Vaccine> fetchByCompanyName(String name) {
        return repo.searchByCompanyName(name);
    }

    @Override
    public List<Vaccine> fetchByCompanyNames(String comp1, String comp2) {
        return repo.searchByVaccineCompany(comp1, comp2);
    }

    @Override
    public List<String> fetchVaccinesByCost(Double minRange, Double maxRange) {
        return repo.searchVaccinesByCost(minRange,maxRange);
    }

    @Override
    public int modifyVaccineCostByVaccineName(Double newPrice, String vaccineName) {
        return repo.updateVaccineCostByVaccineName(newPrice,vaccineName);
    }

    @Override
    public int removeVaccineByVaccineName(String vaccineName) {
        return repo.deleteVaccineByVaccineName(vaccineName);
    }

    @Override
    public int addVaccineInfo(Integer id, String vaccineName, String vaccineCompany, Double cost) {
        return repo.insertVaccineInfo(id, vaccineName, vaccineCompany, cost);
    }

    @Override
    public Date fetchTheSystemDateAndTime() {
        return repo.getTheSystemDateAndTime();
    }
}

