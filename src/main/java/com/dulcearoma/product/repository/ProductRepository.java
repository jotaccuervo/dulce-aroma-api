package com.dulcearoma.product.repository;

import com.dulcearoma.product.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository
        extends JpaRepository<Product, Long> {

}
