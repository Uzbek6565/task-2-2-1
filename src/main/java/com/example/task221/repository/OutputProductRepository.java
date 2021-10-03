package com.example.task221.repository;

import com.example.task221.entity.OutputProduct;
import com.example.task221.projection.CustomOutputProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "outputProduct", excerptProjection = CustomOutputProjection.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {
}
