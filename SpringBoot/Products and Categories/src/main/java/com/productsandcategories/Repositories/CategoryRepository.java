package com.productsandcategories.Repositories;

import com.productsandcategories.Models.Category;
import com.productsandcategories.Models.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends CrudRepository<Category,Long>{
    List<Category> findAll();
    List<Category> findAllByProducts(Product product);

    List<Category> findByProductsNotContains(Product product);

}
