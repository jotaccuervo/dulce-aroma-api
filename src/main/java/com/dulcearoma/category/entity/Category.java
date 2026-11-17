package com.dulcearoma.category.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "categories")
public class Category {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;

        private String description;

        public Category() {
        }

        public Category(
        Long id,
        String name,
        String description
        ) {
        this.id = id;
        this.name = name;
        this.description = description;
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

        public void setId(Long id) {
        this.id = id;
        }

        public void setName(String name) {
        this.name = name;
        }

        public void setDescription(String description) {
        this.description = description;
        }

}