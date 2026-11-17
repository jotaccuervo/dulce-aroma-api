package com.dulcearoma.category.service;

import com.dulcearoma.category.entity.Category;
import com.dulcearoma.category.repository.CategoryRepository;
import org.springframework.stereotype.Service;
import com.dulcearoma.category.dto.CategoryRequestDto;
import com.dulcearoma.category.dto.CategoryResponseDto;
import java.util.List;


/* @Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }   
*/



/* despues de probar la conexion bd
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }


/* PASO Dto
public Category saveCategory(
        CategoryRequestDto request
) {

    Category category = new Category();

    category.setName(
            request.getName()
    );

    category.setDescription(
            request.getDescription()
    );

    return categoryRepository.save(
            category
    );

}*/


/*PASO Dto 2*/
@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(
            CategoryRepository categoryRepository
    ) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories() {

        return categoryRepository.findAll();

    }

    public CategoryResponseDto saveCategory(
            CategoryRequestDto request
    ) {

        Category category = new Category();

        category.setName(
                request.getName()
        );

        category.setDescription(
                request.getDescription()
        );

        Category savedCategory =
                categoryRepository.save(category);

        return toResponseDto(
                savedCategory
        );

    }

    private CategoryResponseDto toResponseDto(
            Category category
    ) {

        return new CategoryResponseDto(
                category.getId(),
                category.getName(),
                category.getDescription()
        );

    }

} 










