package com.productsandcategories.Services;

import com.productsandcategories.Models.Category;
import com.productsandcategories.Models.Product;
import com.productsandcategories.Repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
    public List<Category> allCategory(){
        return categoryRepository.findAll();
    }
    public Category createCategory(Category category){
        return categoryRepository.save(category);

    }
    public Category findCategory(Long id){
        Optional<Category> optionalCategory=categoryRepository.findById(id);
        if (optionalCategory.isPresent()){
            return optionalCategory.get();
        }
        else {
            return null;
        }

    }
    public List<Category> findCategoriesForProduct(Product targetProduct){
        List<Category> categoriesForProduct= categoryRepository.findAllByProducts(targetProduct);
        return categoriesForProduct;
    }

    public List<Category> findCategoriesExc(Product thisProduct){
        List<Category> categoriesExc=categoryRepository.findByProductsNotContains(thisProduct);
        return categoriesExc;
    }

    public Category addCatToProduct(Category thisCategory, Product productToAdd) {
        thisCategory.getProducts().add(productToAdd);
        Category updatedCategory=thisCategory;
        return categoryRepository.save(updatedCategory);

    }
}
