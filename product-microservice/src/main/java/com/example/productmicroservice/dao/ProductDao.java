package com.example.productmicroservice.dao;

import com.example.productmicroservice.repository.ProductRepository;
import entity.ProductEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductDao {
	private final ProductRepository productRepository;

	public void add(ProductEntity product) {
		productRepository.save(product);
	}

	public void deleteById(Long id) {
		productRepository.deleteById(id);
	}

	public ProductEntity getById(Long id) {
		return productRepository.findById(id).orElse(null);
	}

	public void update(ProductEntity product) {
		productRepository.save(product);
	}
}
