package com.dulcearoma.category.controller;

import com.dulcearoma.category.entity.Category;
import com.dulcearoma.category.service.CategoryService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
/* PASO Dto*/
import com.dulcearoma.category.dto.CategoryRequestDto;
/* PASO Dto 2*/
import com.dulcearoma.category.dto.CategoryResponseDto;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(
        CategoryService categoryService) 
        {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }



    /*despues de probar la conexion bd
    @PostMapping
    public Category createCategory(@RequestBody Category category) {
        return categoryService.saveCategory(category);
    } */

/* PASO Dto
    @PostMapping
            public Category createCategory(
                    @RequestBody
                    CategoryRequestDto request
            ) {

                return categoryService.saveCategory(
                        request
                );

            }
}
*/

/*DTo2
public CategoryResponseDto createCategory(
        @RequestBody
        CategoryRequestDto request
) {

    return categoryService.saveCategory(
            request
    );

}

*/

/* version final*/
@PostMapping
public CategoryResponseDto createCategory(

        @Valid
        @RequestBody
        CategoryRequestDto request

) {

    return categoryService.saveCategory(
            request
    );

}
}