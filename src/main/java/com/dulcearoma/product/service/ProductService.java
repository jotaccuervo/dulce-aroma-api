package com.dulcearoma.product.service;

import com.dulcearoma.category.entity.Category;
import com.dulcearoma.category.repository.CategoryRepository;
import com.dulcearoma.product.dto.ProductRequestDto;
import com.dulcearoma.product.dto.ProductResponseDto;
import com.dulcearoma.product.entity.Product;
import com.dulcearoma.product.repository.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    private final CategoryRepository categoryRepository;

    public ProductService(
            ProductRepository productRepository,
            CategoryRepository categoryRepository
    ) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    public ProductResponseDto createProduct(
            ProductRequestDto request
    ) {

        Category category =
                categoryRepository
                        .findById(
                                request.getCategoryId()
                        )
                        .orElseThrow(
                                () -> new RuntimeException(
                                        "Categoría no encontrada"
                                )
                        );

        Product product = new Product();

        product.setName(
                request.getName()
        );

        product.setDescription(
                request.getDescription()
        );

        product.setPrice(
                request.getPrice()
        );

        product.setImageUrl(
                request.getImageUrl()
        );

        product.setCategory(
                category
        );

        Product savedProduct =
                productRepository.save(product);

        return toResponseDto(
                savedProduct
        );

    }

    public List<ProductResponseDto>
    getAllProducts() {

        return productRepository
                .findAll()
                .stream()
                .map(this::toResponseDto)
                .collect(Collectors.toList());

    }

    public ProductResponseDto getProductById(
            Long id
    ) {

        Product product =
                productRepository
                        .findById(id)
                        .orElseThrow(
                                () -> new RuntimeException(
                                        "Producto no encontrado"
                                )
                        );

        return toResponseDto(
                product
        );

    }

        public ProductResponseDto updateProduct(
        Long id,
        ProductRequestDto request
) {

    Product product = productRepository
            .findById(id)
            .orElseThrow(
                    () -> new RuntimeException(
                            "Producto no encontrado"
                    )
            );

    Category category = categoryRepository
            .findById(request.getCategoryId())
            .orElseThrow(
                    () -> new RuntimeException(
                            "Categoría no encontrada"
                    )
            );

    product.setName(
            request.getName()
    );

    product.setDescription(
            request.getDescription()
    );

    product.setPrice(
            request.getPrice()
    );

    product.setImageUrl(
            request.getImageUrl()
    );

    product.setCategory(
            category
    );

    Product savedProduct =
            productRepository.save(product);

    return toResponseDto(
            savedProduct
    );

}

public void deleteProduct(
        Long id
) {

    Product product = productRepository
            .findById(id)
            .orElseThrow(
                    () -> new RuntimeException(
                            "Producto no encontrado"
                    )
            );

    productRepository.delete(product);

}




    private ProductResponseDto toResponseDto(
            Product product
    ) {

        return new ProductResponseDto(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getImageUrl(),
                product.getCategory().getName()
        );

    }

}
