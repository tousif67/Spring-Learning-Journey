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
//		Vaccine vac = service.searchVaccinebyId(1);
//		System.out.println(vac);
//		Vaccine vac = new Vaccine("Phizer","Moderena",5000.65);
//		vac.setId(1);
//		service.searchVaccinebygivenInfo(vac).forEach(vaccine -> System.out.println(vaccine));
		List<Integer> ids = new ArrayList<>();
		ids.add(12);
		ids.add(153);
		ids.add(104);
		String status = service.removeVaccineInfoByIds(ids);
		System.out.println(status);
	}

}
