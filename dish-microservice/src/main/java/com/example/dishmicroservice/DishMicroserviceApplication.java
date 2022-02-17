package com.example.dishmicroservice;

import entity.DishEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableAsync
@EnableDiscoveryClient
@EnableTransactionManagement
@EnableWebMvc
@EntityScan(basePackageClasses = DishEntity.class)
@SpringBootApplication
public class DishMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DishMicroserviceApplication.class, args);
	}

}
