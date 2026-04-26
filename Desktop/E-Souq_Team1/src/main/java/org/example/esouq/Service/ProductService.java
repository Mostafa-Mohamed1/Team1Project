package org.example.esouq.Service;

import org.example.esouq.model.Product;
import org.example.esouq.repositories.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

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

          return productDAO.getProductById(id);
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
          Product existingProduct = productDAO.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
          existingProduct.setName(productToUpdate.getName());
          existingProduct.setPrice(productToUpdate.getPrice());
          return productDAO.save(existingProduct);
      }
}
