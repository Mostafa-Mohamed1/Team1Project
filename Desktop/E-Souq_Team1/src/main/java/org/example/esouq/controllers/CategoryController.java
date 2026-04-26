package org.example.esouq.controllers;

import org.example.esouq.service.CategoryService;
import org.example.esouq.model.Category;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

//Bechir Ben Zaied 764003678

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    // GET all list for hamburger menu
    @GetMapping
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }

    // GET one by id
    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable int id){
        return categoryService.getCategoryById(id);
    }

    // (search by category feature)
    @GetMapping("/search")
    public List<Category> searchCategoriesByName(@RequestParam String name){
        return categoryService.searchCategoriesByName(name);
    }

    // post a new category
    @PostMapping
    public Category addCategory(@RequestBody Category category){
        categoryService.addCategory(category);
        return category;
    }

    //updates existing category
    @PutMapping("/{id}")
    public Category updateCategory(@PathVariable int id, @RequestBody Category category){
        return categoryService.updateCategory(id, category);
    }

    //deletes a category
    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable int id){
        categoryService.deleteCategory(id);
    }
}
