package com.example.consumergateway.controller;

import com.example.consumergateway.client.ProductClient;
import dto.ProductDto;
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

@Api(tags = "Products API endpoints")
@RestController
@RequestMapping(value = "/products")
@RequiredArgsConstructor
public class ProductController {

	private final ProductClient productClient;

	@PostMapping
	public void add(@RequestBody ProductDto product) {
		productClient.add(product);
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		productClient.deleteById(id);
	}

	@GetMapping("/{id}")
	public ProductDto getById(@PathVariable Long id) {
		return productClient.getById(id);
	}

	@PutMapping
	public void update(@RequestBody ProductDto product) {
		productClient.update(product);
	}

	@GetMapping("/test")
	public String test() {
		return "test";
	}
}
