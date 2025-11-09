package com.user.repo;

import com.user.entity.Vaccine;
import com.user.view.ResultView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;

@Repository
public interface IVaccineRepo extends JpaRepository<Vaccine,Integer> {
    //findBy-propertyName-keyword//This is how you write customize finder methods
    List<ResultView> findByCostLessThan(Double cost);
}
