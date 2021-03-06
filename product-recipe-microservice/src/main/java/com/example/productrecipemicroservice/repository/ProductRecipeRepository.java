package com.example.productrecipemicroservice.repository;

import entity.productrecipe.ProductRecipeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRecipeRepository extends JpaRepository<ProductRecipeEntity, Long> {
}
