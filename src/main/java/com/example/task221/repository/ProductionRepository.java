package com.example.task221.repository;

import com.example.task221.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductionRepository extends JpaRepository<Product, Integer> {
}
