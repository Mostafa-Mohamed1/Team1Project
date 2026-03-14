package org.example.esouq;

import org.example.esouq.model.Product;
import org.example.esouq.model.Customer;
import org.example.esouq.model.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @GetMapping("/products")
    public String showProducts(Model model) {
        model.addAttribute("products", getDummyProducts());
        return "products";
    }

    private List<Product> getDummyProducts() {
        List<Product> products = new ArrayList<>();

        Product p1 = new Product();
        p1.setProductId(101);
        p1.setName("iPhone 15 Pro Max");
        p1.setPrice(4999.00);
        products.add(p1);

        Product p2 = new Product();
        p2.setProductId(102);
        p2.setName("Samsung 55 QLED TV");
        p2.setPrice(2999.00);
        products.add(p2);

        Product p3 = new Product();
        p3.setProductId(103);
        p3.setName("MacBook Air M2");
        p3.setPrice(5999.00);
        products.add(p3);

        Product p4 = new Product();
        p4.setProductId(201);
        p4.setName("iPhone 14 Pro");
        p4.setPrice(899.00);
        products.add(p4);

        return products;
    }


    @GetMapping("/customers")
    public String showCustomers(Model model) {
        model.addAttribute("customers", getDummyCustomers());
        return "customers";
    }

    private List<Customer> getDummyCustomers() {
        List<Customer> customers = new ArrayList<>();

        Customer c1 = new Customer();
        c1.setId(1);
        c1.setFirstName("John");
        c1.setLastName("Doe");
        c1.setEmail("john@example.com");
        c1.setPassword("pass123");
        customers.add(c1);

        Customer c2 = new Customer();
        c2.setId(2);
        c2.setFirstName("Jane");
        c2.setLastName("Smith");
        c2.setEmail("jane@example.com");
        c2.setPassword("pass456");
        customers.add(c2);

        return customers;
    }

    @GetMapping("/orders")
    public String showOrders(Model model) {
        model.addAttribute("orders", getDummyOrders());
        return "orders";
    }

    private List<Order> getDummyOrders() {
        List<Order> orders = new ArrayList<>();

        Order o1 = new Order();
        o1.setOrderId(1);
        o1.setOrderStatus("Pending");
        o1.setShippingAddress("123 Main St");
        orders.add(o1);

        Order o2 = new Order();
        o2.setOrderId(2);
        o2.setOrderStatus("Shipped");
        o2.setShippingAddress("456 Oak Ave");
        orders.add(o2);

        return orders;
    }
}