package com.cloud.customercrudmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CustomerCrudMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerCrudMicroserviceApplication.class, args);
	}

}
