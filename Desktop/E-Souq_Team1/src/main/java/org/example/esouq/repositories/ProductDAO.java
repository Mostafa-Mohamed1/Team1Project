package org.example.esouq.repositories;

import org.example.esouq.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ProductDAO extends JpaRepository<Product, Long> {

      List<Product> findByName(String name);

      @Query("SELECT p FROM Product p WHERE p.productId = :id")
      Optional<Product> getProductById(@Param("id") Long id);
}
