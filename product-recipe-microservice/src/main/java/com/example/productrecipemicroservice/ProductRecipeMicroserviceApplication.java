package com.example.productrecipemicroservice;

import entity.productrecipe.ProductRecipeEntity;
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
@EntityScan(basePackageClasses = ProductRecipeEntity.class)
@SpringBootApplication
public class ProductRecipeMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductRecipeMicroserviceApplication.class, args);
	}

}
