package com.example.consumergateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@ServletComponentScan
public class ConsumerGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerGatewayApplication.class, args);
	}

}
