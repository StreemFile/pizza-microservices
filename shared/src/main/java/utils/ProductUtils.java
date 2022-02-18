package utils;

import dto.ProductDto;
import entity.product.ProductEntity;
import org.apache.commons.collections4.CollectionUtils;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ProductUtils {

	public static ProductDto toProductDto(ProductEntity productEntity) {
		if (productEntity == null) {
			return null;
		}
		return ProductDto.builder().id(productEntity.getId()).name(productEntity.getName()).weight(productEntity.getWeight())
				.productType(productEntity.getProductType()).purchasePrice(productEntity.getPurchasePrice()).expirationDate(productEntity.getExpirationDate())
				.build();
	}

	public static List<ProductDto> toProductDto(List<ProductEntity> productEntityList) {
		if (CollectionUtils.isEmpty(productEntityList)) {
			return Collections.emptyList();
		}
		return productEntityList.stream().map(ProductUtils::toProductDto).collect(Collectors.toList());
	}

	public static ProductEntity toProductEntity(ProductDto productDto) {
		if (productDto == null) {
			return null;
		}
		return ProductEntity.builder().id(productDto.getId()).name(productDto.getName()).weight(productDto.getWeight()).productType(productDto.getProductType())
				.purchasePrice(productDto.getPurchasePrice()).expirationDate(productDto.getExpirationDate()).build();
	}

	public static List<ProductEntity> toProductEntity(List<ProductDto> productDtoList) {
		if (CollectionUtils.isEmpty(productDtoList)) {
			return Collections.emptyList();
		}
		return productDtoList.stream().map(ProductUtils::toProductEntity).collect(Collectors.toList());
	}

	public static boolean isExpired(ProductEntity productEntity) {
		return !isNotExpired(productEntity);
	}

	public static boolean isExpired(ProductDto productDto) {
		return !isNotExpired(productDto);
	}

	public static boolean isNotExpired(ProductEntity productEntity) {
		return productEntity.getExpirationDate().isAfter(LocalDate.now());
	}

	public static boolean isNotExpired(ProductDto productDto) {
		return productDto.getExpirationDate().isAfter(LocalDate.now());
	}
}
