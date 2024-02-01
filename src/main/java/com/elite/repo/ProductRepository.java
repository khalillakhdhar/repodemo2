package com.elite.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elite.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
