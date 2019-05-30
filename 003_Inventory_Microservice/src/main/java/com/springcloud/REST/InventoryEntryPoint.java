package com.springcloud.REST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class InventoryEntryPoint {

	public static void main(String[] args) {
		SpringApplication.run(InventoryEntryPoint.class, args);
	}

}
