package org.example.esouq;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}