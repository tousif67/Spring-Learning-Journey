package com.user;

import com.user.dao.EmployeeDaoImp;
import com.user.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringJdbcApplication.class, args);
		EmployeeDaoImp dao = container.getBean(EmployeeDaoImp.class);
//		List<Employee> list = dao.getEmployeeInfo();
//
//		for(Employee e : list) {
//			System.out.println(e);
//		}
//
//		list.forEach(e -> System.out.println(e));

		dao.getEmployeeInfo().forEach(e -> System.out.println(e));
	}

}
