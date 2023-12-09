package com.etopng.tmsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TMSApplication {

	public static void main(String[] args) {
		SpringApplication.run(TMSApplication.class, args);
	}

}
