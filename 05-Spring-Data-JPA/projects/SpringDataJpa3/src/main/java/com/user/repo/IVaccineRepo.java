package com.user.repo;

import com.user.entity.Vaccine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVaccineRepo extends PagingAndSortingRepository<Vaccine,Integer> {
}
