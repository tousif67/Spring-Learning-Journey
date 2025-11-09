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
	service.fetchByCost(15000.00).forEach(v -> System.out.println(v));

	}

}
