package org.example.esouq.service;

import org.example.esouq.model.Category;
import org.example.esouq.repositories.CategoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Bechir Ben Zaied 764003678

@Service
public class CategoryService {

    @Autowired
    private CategoryDAO categoryDAO;

    public List<Category> getAllCategories() {
        return categoryDAO.findAll();
    }

    public Category getCategoryById(int id) {
        return categoryDAO.findById(id).orElse(null);
    }

    public List<Category> searchCategoriesByName(String name) {
        return categoryDAO.findByCategoryNameContainingIgnoreCase(name);
    }

    public void addCategory(Category category) {
        categoryDAO.save(category);
    }

    public Category updateCategory(int id, Category updatedCategory) {
        updatedCategory.setCategoryId(id);

        int rowsUpdated = categoryDAO.updateCategoryById(id, updatedCategory.getCategoryName(), updatedCategory.getCategoryDescription());

        if (rowsUpdated > 0) {
            return categoryDAO.findById(id).orElse(null);
        }
        return null;
    }

    public void deleteCategory(int id) {
        categoryDAO.deleteById(id);
    }
}
