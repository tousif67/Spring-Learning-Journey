package com.user;

import com.user.entity.Vaccine;
import com.user.service.VaccineService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

@SpringBootApplication
public class SpringDataJpa2Application {

	public static void main(String[] args) {


//		Vaccine{id=1, vaccineName='Phizer', vaccineCompany='Moderena', cost=5000.65}
//		Vaccine{id=202, vaccineName='Phizer', vaccineCompany='Moderena', cost=5000.65}
//		Vaccine{id=203, vaccineName='Hepatitis B', vaccineCompany='Who', cost=15000.65}
//		Vaccine{id=204, vaccineName='DTaP', vaccineCompany='Amazon', cost=21000.65}
//		Vaccine{id=205, vaccineName='Tdap', vaccineCompany='Flipkart', cost=9000.65
	ApplicationContext container = SpringApplication.run(SpringDataJpa2Application.class, args);
	VaccineService service  = container.getBean(VaccineService.class);
//			service.fetchByCompanyName("Moderena").forEach(v -> System.out.println(v));
//		service.fetchByCompanyNames("Amazon","Flipkart").forEach(v -> System.out.println(v));

//		service.fetchVaccinesByCost(13000.56,22000.65).forEach(v -> System.out.println(v));
//		int rowsAffected = service.modifyVaccineCostByVaccineName(6000.00,"Phizer");
//		if (rowsAffected !=0) {
//			System.out.println("Update success");
//		} else {
//			System.out.println("Update failure");
//		}


//		int rowsAffected = service.removeVaccineByVaccineName("Phizer");
//		if (rowsAffected !=0)
//			System.out.println("Record deleted");
//		else
//			System.out.println("Record deletion failed");

//		int rowsAffected = service.addVaccineInfo(1,"Phizer","Moderena",6000.36);
//		if (rowsAffected !=0)
//			System.out.println("Record insertion successful");
//		else
//			System.out.println("Record insertion failed");
		System.out.println(service.fetchTheSystemDateAndTime());

	}

}
