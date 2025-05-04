package com.ecom.ProductCatalog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecom.ProductCatalog.model.Category;
import com.ecom.ProductCatalog.repository.CategoryRepository;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;
    
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
