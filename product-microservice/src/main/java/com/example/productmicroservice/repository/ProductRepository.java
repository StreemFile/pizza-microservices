package com.example.productmicroservice.repository;

//import com.example.productmicroservice.entity.ProductEntity;
import entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
