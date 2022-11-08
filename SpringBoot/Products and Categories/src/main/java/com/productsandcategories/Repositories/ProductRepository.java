package com.productsandcategories.Repositories;

import com.productsandcategories.Models.Category;
import com.productsandcategories.Models.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository <Product,Long>{
    List<Product> findAll();
    List<Product> findAllByCategories(Category category);

    List<Product> findByCategoriesNotContains(Category thisCategory);
}
