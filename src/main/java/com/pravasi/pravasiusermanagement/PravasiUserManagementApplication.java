package com.pravasi.pravasiusermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PravasiUserManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PravasiUserManagementApplication.class, args);
	}

}
