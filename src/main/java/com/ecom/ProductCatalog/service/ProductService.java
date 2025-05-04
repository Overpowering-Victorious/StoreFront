package com.ecom.ProductCatalog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecom.ProductCatalog.model.Product;
import com.ecom.ProductCatalog.repository.ProductRepository;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product>getAllProducts(){
        return productRepository.findAll();
    }

    public List<Product>getProductByCategory(Long categoryId){
        return productRepository.findByCategoryId(categoryId);
    }
}
