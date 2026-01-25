package com.example.DiscoverClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication

public class DiscoverClientApplication {

	public static void main(String[] args) {SpringApplication.run(DiscoverClientApplication.class, args);
	}

}
