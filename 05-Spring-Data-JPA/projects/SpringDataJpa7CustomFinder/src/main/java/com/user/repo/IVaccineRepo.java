package com.user.repo;

import com.user.entity.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface IVaccineRepo extends JpaRepository<Vaccine,Integer> {
    //findBy-propertyName-keyword//This is how you write customize finder methods
    //Here it is dynamic customize finder method or dynamic projection, In which we can choose which type columns we can
    // print on the console.
    public List<Vaccine> findByCost(Double cost);
//    public List<Vaccine> findByCostIs(Double cost);
//    public List<Vaccine> findByCostEquals(Double cost);
public List<Vaccine> findByCostLessThan(Double cost);
    public List<Vaccine> findByCostBetween(Double startingCost, Double endingCost);
    public List<Vaccine> findByVaccineCompanyEquals(String name);
    public List<Vaccine> findByVaccineNameInAndCostBetween(Collection<String> names,Double minCost,Double maxCost);



}
