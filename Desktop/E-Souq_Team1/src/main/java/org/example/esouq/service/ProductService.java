package org.example.esouq.service;

import org.example.esouq.model.Product;
import org.example.esouq.repositories.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

//Mustafa Mohamed
@Service
public class ProductService {

    @Autowired
    private ProductDAO productDAO;

    public Product saveProduct(Product product) {
        return productDAO.save(product);
    }

    public List<Product> getAllProducts() {
        return productDAO.findAll();
    }


    public Optional<Product> getProductById(Long id) {
        return productDAO.getProductById(id);     //using jpql query in product.dao
    }

    public List<Product> getProductsByName(String name) {
        return productDAO.findByName(name);
    }

    @Transactional
    public void deleteProductById(Long id) {
        productDAO.deleteById(id);
    }

    @Transactional
    public Product updateById(Long id, Product productToUpdate) {
        int rowsUpdated = productDAO.updateProductById(
                id,
                productToUpdate.getName(),
                productToUpdate.getPrice()
        );

        if (rowsUpdated > 0) {
            return productDAO.findById(id).orElse(null);
        } else {
            throw new RuntimeException("Product not found with id: " + id);
        }
    }
}