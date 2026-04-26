package org.example.esouq.repositories;
import org.example.esouq.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

// Bechir Ben Zaied 764003678
public interface CategoryDAO extends JpaRepository<Category, Integer> {

    @Query("SELECT c FROM Category c WHERE LOWER(c.categoryName) LIKE LOWER(CONCAT('%', :name, '%'))")
    List<Category> findByCategoryNameContainingIgnoreCase(@Param("name") String name);

    @Modifying
    @Transactional
    @Query("UPDATE Category c SET c.categoryName = :name, c.categoryDescription = :description WHERE c.categoryId = :id")
    int updateCategoryById(@Param("id") int id, @Param("name") String name, @Param("description") String description);
}
