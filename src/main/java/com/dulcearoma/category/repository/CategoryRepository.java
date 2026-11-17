package com.dulcearoma.category.repository;

import com.dulcearoma.category.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository 
    extends JpaRepository<Category, Long> {
}