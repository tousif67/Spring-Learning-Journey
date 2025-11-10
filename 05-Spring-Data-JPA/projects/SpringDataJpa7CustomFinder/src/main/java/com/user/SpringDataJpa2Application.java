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
//	service.fetchByCost(15000.65).forEach(v -> System.out.println(v));
//	service.fetchByCostBetween(5000.65,10000.23).forEach(v -> System.out.println(v));
//	service.fetchByCompanyNameEquals("Amazon").forEach(vaccine -> System.out.println(vaccine));
		Collection<String> names = new HashSet<>();
		names.add("Tdap");
		names.add("DTaP");

		service.fetchByVaccineNameInAndCostBetween(names,4000.23,10000.65).forEach(v -> System.out.println(v));
	}

}
