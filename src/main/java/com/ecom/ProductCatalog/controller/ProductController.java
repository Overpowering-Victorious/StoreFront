package com.ecom.ProductCatalog.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.ProductCatalog.model.Product;
import com.ecom.ProductCatalog.service.ProductService;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "http://localhost:5173")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    
    @GetMapping
    public List<Product>getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/category/{categoryId}")
    public List<Product>getAllProductsByCategory(@PathVariable Long categoryId){
        return productService.getProductByCategory(categoryId);
    }
}
