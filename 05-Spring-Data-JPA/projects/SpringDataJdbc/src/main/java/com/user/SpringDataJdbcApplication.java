package com.user;

import com.user.dao.EmployeeDao;
import com.user.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDataJdbcApplication {

	public static void main(String[] args) {

	ConfigurableApplicationContext container =  SpringApplication.run(SpringDataJdbcApplication.class, args);
//	EmployeeDao emp  = container.getBean(EmployeeDao.class);
//	emp.input();
	}

}
