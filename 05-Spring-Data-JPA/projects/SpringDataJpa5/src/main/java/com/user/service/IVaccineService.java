package com.user.service;

import com.user.entity.Vaccine;
import com.user.view.ResultView;

import java.util.List;

public interface IVaccineService {
  public List<ResultView> fetchByCost(Double cost);
}
