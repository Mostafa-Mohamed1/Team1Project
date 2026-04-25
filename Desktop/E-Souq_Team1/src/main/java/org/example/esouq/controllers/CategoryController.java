package org.example.esouq.controllers;

import org.example.esouq.ESouqService;
import org.example.esouq.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private ESouqService eSouqService;

    // GET all list for hamburger menu
    @GetMapping
    public List<Category> getAllCategories(){
        return eSouqService.getCategories();
    }

    // GET one by id
    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable int id){
        return eSouqService.getCategoryById(id);
    }

    // (search by category feature)
    @GetMapping("/search")
    public List<Category> searchCategoriesByName(String name){
        return eSouqService.search.CategoriesByName(name);
    }

    // post a new category
    @PostMapping
    public Category addCategory(@RequestBody Category category){
        eSouqService.addCategory(category);
    }

    //updates existing category
    @PutMapping("/{id}")
    public Category updateCategory(@RequestBody Category category){
        eSouqService.updateCategory(id, category);
    }

    //deletes a category
    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable int id){
        eSouqService.deleteCategory(id);
    }
}
