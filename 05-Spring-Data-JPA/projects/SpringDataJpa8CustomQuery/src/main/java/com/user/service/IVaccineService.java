package com.user.service;

import com.user.entity.Vaccine;
import org.springframework.data.repository.query.Param;


import java.util.Collection;
import java.util.Date;
import java.util.List;

public interface IVaccineService {


  public List<Vaccine> fetchByCompanyName(@Param("company")String name);


  public List<Vaccine> fetchByCompanyNames(String comp1,String comp2);

  public List<String> fetchVaccinesByCost(Double minRange, Double maxRange);

  public int modifyVaccineCostByVaccineName(Double newPrice, String vaccineName);

  public int removeVaccineByVaccineName(String vaccineName);
  public int addVaccineInfo(Integer id, String vaccineName,String vaccineCompany,Double cost);

  public Date fetchTheSystemDateAndTime();
}
