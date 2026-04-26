/*package org.example.esouq.controllers;

import org.example.esouq.ESouqService;
import org.example.esouq.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;*/

/*
@Controller
public class MainController {

    private ESouqService eSouqService;

    public MainController(ESouqService eSouqService) {
        this.eSouqService = eSouqService;
    }

    @GetMapping("/products")
    public String showProducts(Model model) {
        model.addAttribute("products", eSouqService.getProducts());
        return "products";
    }

    @GetMapping("/customers")
    public String showCustomers(Model model) {
        model.addAttribute("customers", eSouqService.getCustomers());
        return "customers";
    }

    @GetMapping("/orders")
    public String showOrders(Model model) {
        model.addAttribute("orders", eSouqService.getOrders());
        return "orders";
    }

    @GetMapping("/products/add")
    public String addProductPage() {
        return "add-product";
    }

    // Submit product
    @PostMapping("/products/add")
   public String addProductSubmit(@RequestParam String name, @RequestParam double price){
        Product product = new Product(name, price);
        eSouqService.addProduct(product);
        return "redirect:/add/success/product";
    }

    //Success page controller
    @GetMapping("/add/success/{entityName}")
    public String addSuccess(@PathVariable String entityName, Model model){
        model.addAttribute("entityName", entityName);
        return "add-success";
    }

    @GetMapping("/customers/add")
    public String addCustomerPage() {
        return "add-customer";
    }

    @GetMapping("/orders/add")
    public String addOrderPage(Model model) {
        model.addAttribute("customers", eSouqService.getCustomers());
        model.addAttribute("products", eSouqService.getProducts());
        return "add-order";
    }
}*/
