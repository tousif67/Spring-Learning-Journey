package com.user.service;

import com.user.entity.Vaccine;

public interface IVaccineService {
    public String registerVaccineInfo(Vaccine vaccine);
    public Iterable<Vaccine> registerMultipleVaccineInfo(Iterable<Vaccine> vaccines);
    public Long countVaccines();
    public Boolean checkVaccineAvailability(Integer id);
    public Iterable<Vaccine> getAllVaccineInfo();
}
