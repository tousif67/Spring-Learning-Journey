package com.user.repo;

import com.user.entity.Vaccine;
import com.user.view.ResultView1;
import com.user.view.View;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IVaccineRepo extends JpaRepository<Vaccine,Integer> {
    //findBy-propertyName-keyword//This is how you write customize finder methods
    //Here it is dynamic customize finder method or dynamemic projection, In which we can choose which type colums we can
    // print on the console.
    public<T extends View>List<T> findByCostLessThan(Double cost, Class<T> cls);
}
