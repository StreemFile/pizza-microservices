package com.example.productrecipemicroservice.service;

import com.example.productrecipemicroservice.dao.ProductRecipeDao;
import dto.ProductRecipeDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import utils.ProductRecipeUtils;

@Service
@RequiredArgsConstructor
public class ProductRecipeService {
	private final ProductRecipeDao productRecipeDao;

	public void add(ProductRecipeDto product) {
		if (product != null) {
			productRecipeDao.add(ProductRecipeUtils.toProductRecipeEntity(product));
		}
	}

	public void deleteById(Long id) {
		productRecipeDao.deleteById(id);
	}

	public ProductRecipeDto getById(Long id) {
		return ProductRecipeUtils.toProductRecipeDto(productRecipeDao.getById(id));
	}

	public void update(ProductRecipeDto product) {
		if (product != null) {
			productRecipeDao.update(ProductRecipeUtils.toProductRecipeEntity(product));
		}
	}
}

