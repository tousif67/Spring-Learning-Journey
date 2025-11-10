package com.user.service;

import com.user.entity.Vaccine;


import java.util.Collection;
import java.util.List;

public interface IVaccineService {
  public List<Vaccine> fetchByCost(Double cost);
  public List<Vaccine> fetchByCostLessThan(Double cost);
  public List<Vaccine> fetchByCostBetween(Double startingCost, Double endingCost);
  public List<Vaccine> fetchByCompanyNameEquals(String name);
  public List<Vaccine> fetchByVaccineNameInAndCostBetween(Collection<String> names, Double minCost, Double maxCost);
}
