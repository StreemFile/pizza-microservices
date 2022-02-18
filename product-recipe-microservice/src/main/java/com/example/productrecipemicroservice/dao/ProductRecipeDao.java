package com.example.productrecipemicroservice.dao;

import entity.productrecipe.ProductRecipeEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import com.example.productrecipemicroservice.repository.ProductRecipeRepository;

@Component
@RequiredArgsConstructor
public class ProductRecipeDao {
	private final ProductRecipeRepository productRecipeRepository;

	public void add(ProductRecipeEntity product) {
		productRecipeRepository.save(product);
	}

	public void deleteById(Long id) {
		productRecipeRepository.deleteById(id);
	}

	public ProductRecipeEntity getById(Long id) {
		return productRecipeRepository.findById(id).orElse(null);
	}

	public void update(ProductRecipeEntity product) {
		productRecipeRepository.save(product);
	}
}