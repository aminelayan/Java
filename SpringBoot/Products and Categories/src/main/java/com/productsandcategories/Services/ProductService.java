package com.productsandcategories.Services;

import com.productsandcategories.Models.Category;
import com.productsandcategories.Models.Product;
import com.productsandcategories.Repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductService {
        private final ProductRepository productRepository;

        public ProductService(ProductRepository productRepository) {
                this.productRepository = productRepository;
        }
        public List<Product> allProducts(){
                return productRepository.findAll();
        }
        public Product createProduct(Product product){
                return productRepository.save(product);
        }
        public Product findProduct(Long id){
                Optional<Product> optionalProduct =productRepository.findById(id);
                if(optionalProduct.isPresent()){
                        return optionalProduct.get();
                }else {
                        return null;
                }
        }
        public Product addCatToProduct(Product thisProduct, Category categoryToAdd) {
                thisProduct.getCategories().add(categoryToAdd);
                Product updatedProduct=thisProduct;
                return productRepository.save(updatedProduct);

        }

        public List<Product> findProductsForCategory(Category targetCategory){
                List<Product> productsForCategory= productRepository.findAllByCategories(targetCategory);
                return productsForCategory;
        }

        public List<Product> findProductsExc(Category thisCategory){
                List<Product> productsExc=productRepository.findByCategoriesNotContains(thisCategory);
                return productsExc;
        }

}

