package com.user;

import com.user.entity.Vaccine;
import com.user.service.VaccineService;
import com.user.view.ResultView2;
import com.user.view.ResultView3;
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
	service.fetchByCostLessThan(15000.80, ResultView2.class).forEach(v -> System.out.println(v));

	}

}
