package com.example.productrecipemicroservice.controller;

import com.example.productrecipemicroservice.service.ProductRecipeService;
import dto.ProductRecipeDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/recipe-products")
@RequiredArgsConstructor
public class ProductRecipeController {
	private final ProductRecipeService productRecipeService;

	@PostMapping
	public void add(@RequestBody ProductRecipeDto productRecipe) {
		productRecipeService.add(productRecipe);
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		productRecipeService.deleteById(id);
	}

	@GetMapping("/{id}")
	public ProductRecipeDto getById(@PathVariable Long id) {
		return productRecipeService.getById(id);
	}

	@PutMapping
	public void update(@RequestBody ProductRecipeDto productRecipe) {
		productRecipeService.update(productRecipe);
	}

	@GetMapping("/test")
	public String test() {
		return "test";
	}
}