package com.nttdata.eurekaservice;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaserviceApplication.class, args);
	}

}
