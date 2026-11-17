package com.dulcearoma.category.dto;
/* PASO Dto 2*/
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CategoryRequestDto {

    @NotBlank(message = "El nombre es obligatorio")
    @Size(
            min = 3,
            max = 100,
            message = "El nombre debe tener entre 3 y 100 caracteres"
    )
    private String name;

    @NotBlank(message = "La descripción es obligatoria")
    @Size(
            min = 5,
            max = 255,
            message = "La descripción debe tener entre 5 y 255 caracteres"
    )
    private String description;

    public CategoryRequestDto() {
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}



