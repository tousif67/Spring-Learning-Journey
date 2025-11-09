package com.user.service;

import com.user.entity.Vaccine;

import java.util.List;
import java.util.Optional;

public interface IVaccineService {
    public String registerVaccineInfo(Vaccine vaccine);
    public Iterable<Vaccine> registerMultipleVaccineInfo(Iterable<Vaccine> vaccines);
    public Long countVaccines();
    public Boolean checkVaccineAvailability(Integer id);
    public Iterable<Vaccine> getAllVaccineInfo();
    public Iterable<Vaccine> getAllVaccines(Iterable<Integer> ids);
    public Optional<Vaccine> getVaccineById(Integer id);
    public String removeVaccineById(Integer id);
    public String removeVaccineByObject(Vaccine obj);
    public String removeAllVaccines(List<Integer> ids);

}
