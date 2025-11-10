package com.user;

import com.user.dto.CustomerDTO;
import com.user.service.ICustomerService;
import com.user.utils.IdGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataMongoDbApplication {

	public static void main(String[] args) {
	ApplicationContext container = SpringApplication.run(SpringDataMongoDbApplication.class, args);
	ICustomerService service = container.getBean(ICustomerService.class);
//		CustomerDTO dto = new CustomerDTO(125,"Rahul","Jaipur");
//	String status= service.registerCustomer(dto);
//		System.out.println(status);

		CustomerDTO dto = new CustomerDTO();
		dto.setId(IdGenerator.generateId());
		dto.setCustNo(126);
		dto.setName("Abdul");
//		dto.setCity("Kashmir");
//
//
//		String status= service.registerCustomer(dto);
//		System.out.println(status);
		String status = service.removeDocument("6911c4285f0a6f41e163b113");
		System.out.println(status);
		service.findAllCustomers().forEach(v-> System.out.println(v));



	}

}
