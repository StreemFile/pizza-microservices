package com.example.consumergateway.client;

import dto.ProductRecipeDto;
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
@FeignClient("product-recipe-microservice")
@RibbonClient(name = "product-recipe-microservice")
public interface ProductRecipeClient {
	@PostMapping
	void add(@RequestBody ProductRecipeDto productRecipe);

	@DeleteMapping("/{id}")
	void deleteById(@PathVariable(name = "id") Long id);

	@GetMapping("/{id}")
	ProductRecipeDto getById(@PathVariable(name = "id") Long id);

	@PutMapping
	void update(@RequestBody ProductRecipeDto productRecipe);

	@GetMapping("/test")
	String test();
}