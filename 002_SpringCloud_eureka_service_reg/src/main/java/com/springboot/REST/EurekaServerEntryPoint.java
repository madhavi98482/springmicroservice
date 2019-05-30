package com.springboot.REST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerEntryPoint {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerEntryPoint.class, args);
	}

}
