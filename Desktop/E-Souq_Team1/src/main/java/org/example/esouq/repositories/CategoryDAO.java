package org.example.esouq.repositories;
import org.example.esouq.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CategoryDAO extends JpaRepository<Category, Integer> {

    List<Category> findByCategoryNameContainingIgnoreCase(String name);
}
