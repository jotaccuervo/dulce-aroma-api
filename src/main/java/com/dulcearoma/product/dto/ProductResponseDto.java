package com.dulcearoma.product.dto;

public class ProductResponseDto {

    private Long id;

    private String name;

    private String description;

    private Double price;

    private String imageUrl;

    private String categoryName;

    public ProductResponseDto() {
    }

    public ProductResponseDto(
            Long id,
            String name,
            String description,
            Double price,
            String imageUrl,
            String categoryName
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
        this.categoryName = categoryName;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getCategoryName() {
        return categoryName;
    }

}