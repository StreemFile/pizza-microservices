package com.example.consumergateway.controller;

import com.example.consumergateway.client.ProductRecipeClient;
import dto.ProductRecipeDto;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "Recipe products API endpoints")
@RestController
@RequestMapping(value = "/recipe-products")
@RequiredArgsConstructor
public class ProductRecipeController {

	private final ProductRecipeClient productRecipeClient;

	@PostMapping
	public void add(@RequestBody ProductRecipeDto productRecipe) {
		productRecipeClient.add(productRecipe);
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		productRecipeClient.deleteById(id);
	}

	@GetMapping("/{id}")
	public ProductRecipeDto getById(@PathVariable Long id) {
		return productRecipeClient.getById(id);
	}

	@PutMapping
	public void update(@RequestBody ProductRecipeDto productRecipe) {
		productRecipeClient.update(productRecipe);
	}

	@GetMapping("/test")
	public String test() {
		return "test";
	}
}
