package utils;

import dto.ProductRecipeDto;
import entity.ProductRecipeEntity;
import org.apache.commons.collections4.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ProductRecipeUtils {
	public static ProductRecipeDto toProductRecipeDto(ProductRecipeEntity productRecipe) {
		if (productRecipe == null) {
			return null;
		}
		return ProductRecipeDto.builder().id(productRecipe.getId()).name(productRecipe.getName()).productType(productRecipe.getProductType())
				.weight(productRecipe.getWeight()).build();
	}

	public static List<ProductRecipeDto> toProductRecipeDto(List<ProductRecipeEntity> productRecipeList) {
		if (CollectionUtils.isEmpty(productRecipeList)) {
			return Collections.emptyList();
		}
		return productRecipeList.stream().map(ProductRecipeUtils::toProductRecipeDto).collect(Collectors.toList());
	}

	public static ProductRecipeEntity toProductRecipeEntity(ProductRecipeDto productRecipe) {
		if (productRecipe == null) {
			return null;
		}
		return ProductRecipeEntity.builder().id(productRecipe.getId()).name(productRecipe.getName()).productType(productRecipe.getProductType())
				.weight(productRecipe.getWeight()).build();
	}

	public static List<ProductRecipeEntity> toProductRecipeEntity(List<ProductRecipeDto> productRecipeList) {
		if (CollectionUtils.isEmpty(productRecipeList)) {
			return Collections.emptyList();
		}
		return productRecipeList.stream().map(ProductRecipeUtils::toProductRecipeEntity).collect(Collectors.toList());
	}

	public static List<ProductRecipeDto> filterByIdList(List<ProductRecipeDto> productRecipeList, List<Long> id) {
		return productRecipeList.stream().filter(item -> id.contains(item.getId())).collect(Collectors.toList());
	}

	public static List<Long> getIdList(List<ProductRecipeDto> productRecipeList) {
		return productRecipeList.stream().map(ProductRecipeDto::getId).collect(Collectors.toList());
	}
}
