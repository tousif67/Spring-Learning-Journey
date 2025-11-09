package com.user.service;

import com.user.entity.Vaccine;

import java.util.List;

public interface IVaccineService {
    public Vaccine searchVaccinebyId(Integer id);
    public List<Vaccine> searchVaccinebygivenInfo(Vaccine vac);
    public String removeVaccineInfoByIds(Iterable<Integer> ids);
}
