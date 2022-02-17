package com.example.productmicroservice.service;

import com.example.productmicroservice.dao.ProductDao;
import dto.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import utils.ProductUtils;

@Service
@RequiredArgsConstructor
public class ProductService {
	private final ProductDao productDao;

	public void add(ProductDto product) {
		if (product != null) {
			productDao.add(ProductUtils.toProductEntity(product));
		}
	}

	public void deleteById(Long id) {
		productDao.deleteById(id);
	}

	public ProductDto getById(Long id) {
		return ProductUtils.toProductDto(productDao.getById(id));
	}

	public void update(ProductDto product) {
		if (product != null) {
			productDao.update(ProductUtils.toProductEntity(product));
		}
	}
}
