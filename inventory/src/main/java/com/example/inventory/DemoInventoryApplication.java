package com.example.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoInventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoInventoryApplication.class, args);
	}

}
