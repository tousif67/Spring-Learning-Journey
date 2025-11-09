package com.user;

import com.user.entity.Vaccine;
import com.user.service.VaccineService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringDataJpa2Application {

	public static void main(String[] args) {

	ApplicationContext container = SpringApplication.run(SpringDataJpa2Application.class, args);
	VaccineService service  = container.getBean(VaccineService.class);

//	service.fetchDetailsBySorting(true,"vaccineName","vaccineCompany")
//	.forEach(v -> System.out.println(v.getVaccineName() + " " + v.getVaccineCompany()));

//	service.fetchDetailsByPagination(1,2,true,"vaccineName").forEach(v -> System.out.println(v.getVaccineName() + " " + v.getVaccineCompany()));
	service.fetchDetailsByPagination(2);
	}

}
