package com.example.productmicroservice.controller;

import com.example.productmicroservice.service.ProductService;
import dto.ProductDto;
import entity.ProductEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/products")
@RequiredArgsConstructor
public class ProductController {
	private final ProductService productService;

	@PostMapping
	public void add(@RequestBody ProductDto product) {
		productService.add(product);
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		productService.deleteById(id);
	}

	@GetMapping("/{id}")
	public ProductDto getById(@PathVariable Long id) {
		return productService.getById(id);
	}

	@PutMapping
	public void update(@RequestBody ProductDto product) {
		productService.update(product);
	}

	@GetMapping("/test")
	public String test() {
		return "test";
	}
}
