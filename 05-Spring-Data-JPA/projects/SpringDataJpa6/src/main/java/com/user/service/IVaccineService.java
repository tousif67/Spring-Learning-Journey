package com.user.service;

import com.user.view.ResultView1;
import com.user.view.View;

import java.util.List;

public interface IVaccineService {
  public <T extends View> List<T> fetchByCostLessThan(Double cost, Class<T> cls);
}
