package com.user.repo;

import com.user.entity.Vaccine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVaccineRepo extends CrudRepository<Vaccine,Integer> {
}
