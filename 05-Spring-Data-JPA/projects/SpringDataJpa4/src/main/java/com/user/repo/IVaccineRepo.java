package com.user.repo;

import com.user.entity.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVaccineRepo extends JpaRepository<Vaccine,Integer> {
}
