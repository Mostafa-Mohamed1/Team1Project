package org.example.esouq.service;

import org.example.esouq.model.Category;
import org.example.esouq.repositories.CategoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public void updateCategory(int id, Category updatedCategory) {
        updatedCategory.setCategoryId(id);
        categoryDAO.save(updatedCategory);  //.save() updates if id already exist in obj
    }

    public void deleteCategory(int id) {
        categoryDAO.deleteById(id);
    }
}
