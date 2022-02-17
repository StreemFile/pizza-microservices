package dto;

import enums.ProductType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductRecipeDto {
	private Long id;
	private String name;
	private ProductType productType;
	private Integer weight;
}
