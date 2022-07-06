package com.priceandpromotion.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class PriceAndPromotionServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PriceAndPromotionServicesApplication.class, args);
	}

}
