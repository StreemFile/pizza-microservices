package dto;

import enums.DishType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DishDto {
	private Long id;
	private String name;
	private BigDecimal price;
	private List<ProductRecipeDto> productRecipeIdList;
	private DishType dishType;
}
