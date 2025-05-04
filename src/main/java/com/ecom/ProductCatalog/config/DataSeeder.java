package com.ecom.ProductCatalog.config;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ecom.ProductCatalog.model.Category;
import com.ecom.ProductCatalog.model.Product;
import com.ecom.ProductCatalog.repository.CategoryRepository;
import com.ecom.ProductCatalog.repository.ProductRepository;

@Component
public class DataSeeder implements CommandLineRunner{

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public DataSeeder(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        //clear all
        productRepository.deleteAll();
        categoryRepository.deleteAll();

        //categories
        Category electronics= new Category();
        electronics.setName("Electronics");
        
        Category clothing=new Category();
        clothing.setName("Clothing");

        Category home=new Category();
        home.setName("Home and Kitchen");

        categoryRepository.saveAll(Arrays.asList(electronics,clothing,home));

        //products

        Product phone=new Product();
        phone.setName("OnePlus");
        phone.setDescription("One of the best phones.");
        phone.setImageURL("https://placehold.co/600x400");
        phone.setPrice(699.99);
        phone.setCategory(electronics);

        Product laptop=new Product();
        laptop.setName("Asus TUF Gaming");
        laptop.setDescription("High performance gaming laptop.");
        laptop.setImageURL("https://placehold.co/600x400");
        laptop.setPrice(999.99);
        laptop.setCategory(electronics);

        Product suit=new Product();
        suit.setName("Suit");
        suit.setDescription("Coat, shirt, pant.");
        suit.setImageURL("https://placehold.co/600x400");
        suit.setPrice(129.99);
        suit.setCategory(clothing);

        Product blender=new Product();
        blender.setName("Blender");
        blender.setDescription("High speed blender.");
        blender.setImageURL("https://placehold.co/600x400");
        blender.setPrice(99.99);
        blender.setCategory(home);

        productRepository.saveAll(Arrays.asList(phone,laptop,suit,blender));
    }
    
}
