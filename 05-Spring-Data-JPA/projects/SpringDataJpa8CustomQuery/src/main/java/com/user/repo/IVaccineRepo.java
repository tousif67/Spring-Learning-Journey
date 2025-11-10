package com.user.repo;

import com.user.entity.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.Date;
import java.util.List;

@Repository
public interface IVaccineRepo extends JpaRepository<Vaccine,Integer> {

//    @Query("FROM Vaccine WHERE vaccineCompany=:company")
//    public List<Vaccine> searchByCompanyName(String company);
    @Query("FROM Vaccine WHERE vaccineCompany=:company")
    public List<Vaccine> searchByCompanyName(@Param("company")String name);

    @Query("FROM Vaccine WHERE vaccineCompany IN(:comp1,:comp2)")
    public List<Vaccine> searchByVaccineCompany(String comp1,String comp2);


    @Query("SELECT vaccineName, vaccineCompany FROM Vaccine WHERE cost BETWEEN :minRange AND :maxRange")
    public List<String> searchVaccinesByCost(Double minRange, Double maxRange);

    @Transactional
    @Modifying
    @Query("Update Vaccine SET cost=:newPrice WHERE vaccineName=:vaccineName")
    public int updateVaccineCostByVaccineName(Double newPrice, String vaccineName);

    @Transactional
    @Modifying
    @Query("Delete FROM Vaccine WHERE vaccineName=:vaccineName")
    public int deleteVaccineByVaccineName(String vaccineName);

    @Transactional
    @Modifying
    //Writing value attribute where there are multiple field/column names is compulsory otherwise it is optional.
    @Query( value="Insert INTO vaccine(`id`,`vaccine_name`,`vaccine_company`,`cost`) Values(?,?,?,?)" ,nativeQuery=true)
    public int insertVaccineInfo(Integer id, String vaccineName,String vaccineCompany,Double cost);



    @Query(value = "SELECT NOW() FROM DUAL",nativeQuery = true )
    public Date getTheSystemDateAndTime();


}
