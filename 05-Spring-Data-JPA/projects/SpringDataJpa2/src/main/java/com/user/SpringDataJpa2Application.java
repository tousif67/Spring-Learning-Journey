package com.user;

import com.user.entity.Vaccine;
import com.user.service.VaccineService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringDataJpa2Application {

	public static void main(String[] args) {

	ApplicationContext container = SpringApplication.run(SpringDataJpa2Application.class, args);
	VaccineService service  = container.getBean(VaccineService.class);
//	 String status = service.registerVaccineInfo(new Vaccine("Phizer","Moderena",5000.65));
////		System.out.println(status);
//		Vaccine vac1 = new Vaccine("Hepatitis B" ,"Who",15000.65);
//		Vaccine vac2 = new Vaccine("DTaP","Amazon",21000.65);
//		Vaccine vac3 = new Vaccine("Tdap","Flipkart",9000.65);
//		List<Vaccine> vaccines = new ArrayList<Vaccine>();
//		vaccines.add(vac1);
//		vaccines.add(vac2);
//		vaccines.add(vac3);
//		service.registerMultipleVaccineInfo(vaccines).forEach(v -> System.out.println(v));
//
//		Long count = service.countVaccines();
//		System.out.println("Number of Vaccines available: " + count);
//
//		Integer id = 3;
//		Boolean flag = service.checkVaccineAvailability(id);
//		if (flag)
//			System.out.println("Vaccine with Id " + id +" is available." );
//		else
//			System.out.println("Vaccine with Id " + id +" is not available." );
//
		service.getAllVaccineInfo().forEach(v -> System.out.println(v));
//		List<Integer> ids = new ArrayList<>();
//		ids.add(102);
//		ids.add(103);
//		ids.add(104);
//		service.getAllVaccines(ids).forEach(v -> System.out.println(v));
		Integer id =105;
//		 Optional<Vaccine> optional = service.getVaccineById(id);
//	 if(optional.isPresent())
//		 System.out.println(optional.get());
//	 else
//		 System.out.println("Vaccine with id " + id + " is not in records");
//		String status = service.removeVaccineById(id);
//		System.out.println(status);

//		service.removeVaccineByObject(ob)
//		Vaccine vac3 = new Vaccine("Covaxin","BharatBio",9000.65);
//		vac3.setId(103);
//		String status  = service.removeVaccineByObject(vac3);
//		System.out.println(status);

//		List<Integer> ids = new ArrayList<>();
//		ids.add(2);
//		ids.add(3);
//		ids.add(55);
//		ids.add(102);
//		String status = service.removeAllVaccines(ids);
//		System.out.println(status);
	}

}
