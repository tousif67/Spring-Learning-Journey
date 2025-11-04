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
	 String status = service.registerVaccineInfo(new Vaccine("Phizer","Moderena",5000.65));
		System.out.println(status);
		Vaccine vac1 = new Vaccine("Polio","Who",15000.65);
		Vaccine vac2 = new Vaccine("CovidShield","Astrazenica",21000.65);
		Vaccine vac3 = new Vaccine("Covaxin","BharatBio",9000.65);
		List<Vaccine> vaccines = new ArrayList<Vaccine>();
		vaccines.add(vac1);
		vaccines.add(vac2);
		vaccines.add(vac3);
		service.registerMultipleVaccineInfo(vaccines).forEach(v -> System.out.println(v));

		Long count = service.countVaccines();
		System.out.println("Number of Vaccines available: " + count);

		Integer id = 3;
		Boolean flag = service.checkVaccineAvailability(id);
		if (flag)
			System.out.println("Vaccine with Id " + id +" is available." );
		else
			System.out.println("Vaccine with Id " + id +" is not available." );

		service.getAllVaccineInfo().forEach(v -> System.out.println(v));
	}

}
