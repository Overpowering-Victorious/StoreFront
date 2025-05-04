package com.ecom.ProductCatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.ProductCatalog.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long>  {
    
}
