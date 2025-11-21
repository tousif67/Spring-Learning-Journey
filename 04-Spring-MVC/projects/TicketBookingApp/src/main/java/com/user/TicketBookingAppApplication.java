package com.user;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

//This is how we give information of the Overall API
//Swagger (OpenAPI) is primarily used for API documentation
@OpenAPIDefinition(
		info = @Info(
				title = "TicketBookingAPI",
				version = "v1.0",
				description = "This API will book and generate Ticket"
		),
		servers =@Server(
				url = "http://localhost:8484/TicketBookingAPI",
				description = "This API will deploy in this url."
		)

)
public class TicketBookingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingAppApplication.class, args);
	}

}
