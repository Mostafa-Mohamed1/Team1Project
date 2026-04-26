package org.example.esouq.repositories;

import jakarta.transaction.Transactional;
import org.example.esouq.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

//Mostafa Mohamed 770000404

public interface ProductDAO extends JpaRepository<Product, Long> {

      List<Product> findByName(String name);

      @Query("SELECT p FROM Product p WHERE p.productId = :id")
      Optional<Product> getProductById(@Param("id") Long id);

      @Modifying
      @Transactional
      @Query("UPDATE Product p SET p.name = :name, p.price = :price WHERE p.productId = :id")
      int updateProductById(@Param("id") Long id, @Param("name") String name, @Param("price") double price);
}
