package com.example.consumergateway.client;

import dto.ProductDto;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@FeignClient("product-microservice")
@RibbonClient(name = "product-microservice")
public interface ProductClient {
	@PostMapping
	void add(@RequestBody ProductDto product);

	@DeleteMapping("/{id}")
	void deleteById(@PathVariable(name = "id") Long id);

	@GetMapping("/{id}")
	ProductDto getById(@PathVariable(name = "id") Long id);

	@PutMapping
	void update(@RequestBody ProductDto product);

	@GetMapping("/test")
	String test();
}
