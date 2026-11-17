package com.dulcearoma.product.controller;

import com.dulcearoma.product.dto.ProductRequestDto;
import com.dulcearoma.product.dto.ProductResponseDto;
import com.dulcearoma.product.service.ProductService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(
            ProductService productService
    ) {
        this.productService = productService;
    }

    @PostMapping
    public ProductResponseDto createProduct(

            @Valid
            @RequestBody
            ProductRequestDto request

    ) {

        return productService.createProduct(
                request
        );

    }

    @GetMapping
public List<ProductResponseDto> getAllProducts() {

    return productService.getAllProducts();

}

@GetMapping("/{id}")
public ProductResponseDto getProductById(
        @PathVariable Long id
) {

    return productService.getProductById(id);

}

@PutMapping("/{id}")
public ProductResponseDto updateProduct(

        @PathVariable Long id,

        @Valid
        @RequestBody
        ProductRequestDto request

) {

    return productService.updateProduct(
            id,
            request
    );

}

@DeleteMapping("/{id}")
public void deleteProduct(
        @PathVariable Long id
) {

    productService.deleteProduct(id);

}

}