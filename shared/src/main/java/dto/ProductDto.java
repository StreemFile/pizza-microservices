package dto;

import enums.ProductType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDto {
	private Long id;
	private String name;
	private Integer weight;
	private ProductType productType;
	private BigDecimal purchasePrice;
	private LocalDate expirationDate;
}
