package com.user.service;

import com.user.entity.Vaccine;

import java.util.List;

public interface IVaccineService {
    public Iterable<Vaccine> fetchDetailsBySorting(boolean status, String... prop) ;
    public List<Vaccine> fetchDetailsByPagination(int pgNo, int pgSize,boolean status, String... prop);
    public void fetchDetailsByPagination(int pgSize) ;
}
