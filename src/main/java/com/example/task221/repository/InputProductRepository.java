package com.example.task221.repository;

import com.example.task221.entity.InputProduct;
import com.example.task221.projection.CustomInputProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "inputProduct", excerptProjection = CustomInputProject.class)
public interface InputProductRepository extends JpaRepository<InputProduct, Integer> {
}
