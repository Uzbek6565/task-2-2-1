package com.example.task221.repository;

import com.example.task221.entity.Product;
import com.example.task221.projection.CustomProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product", excerptProjection = CustomProduct.class)
public interface ProductionRepository extends JpaRepository<Product, Integer> {
}
