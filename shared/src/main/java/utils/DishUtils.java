package utils;

import dto.DishDto;
import dto.ProductRecipeDto;
import entity.dish.DishEntity;
import org.apache.commons.collections4.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DishUtils {
	public static DishDto toDishRecipeDto(DishEntity dishRecipe, List<ProductRecipeDto> productRecipeList) {
		if (dishRecipe == null) {
			return null;
		}
		return DishDto.builder()
				.id(dishRecipe.getId())
				.name(dishRecipe.getName())
				.price(dishRecipe.getPrice())
				.dishType(dishRecipe.getDishType())
				.productRecipeIdList(productRecipeList)
				.build();
	}

	public static List<DishDto> toDishRecipeDto(List<DishEntity> dishRecipeList, List<ProductRecipeDto> productRecipeList) {
		if (CollectionUtils.isEmpty(dishRecipeList)) {
			return Collections.emptyList();
		}
		return dishRecipeList.stream()
				.map(item -> DishUtils.toDishRecipeDto(item, ProductRecipeUtils.filterByIdList(productRecipeList, item.getProductRecipeIdList())))
				.collect(Collectors.toList());
	}

	public static DishEntity toDishRecipeEntity(DishDto dishRecipe) {
		if (dishRecipe == null) {
			return null;
		}
		List<Long> productRecipeIdList = ProductRecipeUtils.getIdList(dishRecipe.getProductRecipeIdList());
		return DishEntity.builder()
				.id(dishRecipe.getId())
				.name(dishRecipe.getName())
				.dishType(dishRecipe.getDishType())
				.price(dishRecipe.getPrice())
				.productRecipeIdList(productRecipeIdList)
				.build();
	}

	public static List<DishEntity> toDishRecipeEntity(List<DishDto> dishRecipeList) {
		if (CollectionUtils.isEmpty(dishRecipeList)) {
			return Collections.emptyList();
		}
		return dishRecipeList.stream().map(DishUtils::toDishRecipeEntity).collect(Collectors.toList());
	}
}
