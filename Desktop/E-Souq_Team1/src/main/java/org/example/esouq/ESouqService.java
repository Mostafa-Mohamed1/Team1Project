//package org.example.esouq;
//
//import org.example.esouq.model.Customer;
//import org.example.esouq.model.Order;
//import org.example.esouq.model.Product;
//import org.springframework.stereotype.Service;
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class ESouqService {
//
//    private List<Product> products;
//    private List<Customer> customers;
//    private List<Order> orders;
//
//    public ESouqService() {
//        products = new ArrayList<>();
//        customers = new ArrayList<>();
//        orders = new ArrayList<>();
//
//        Product p1 = new Product(8834,"mac laptop", 3500);
//        Product p2 = new Product(9945,"iphone", 2200);
//
//        Customer c1 = new Customer(11980, "Ali", "Yasser", "ali@rit.com");
//        Customer c2 = new Customer(21222, "Sara", "Ahmed", "sara@rit.com");
//
//        products.add(p1);
//        products.add(p2);
//
//        customers.add(c1);
//        customers.add(c2);
//
//        Order order1 = new Order();
//        order1.setOrderId(1);
//        order1.setOrderStatus("Shipped");
//        order1.setShippingAddress("123 Residential");
//        order1.setCustomer(c1);     //Ali
//        order1.setProduct(p1);      //Mac laptop
//
//        Order order2 = new Order();
//        order2.setOrderId(2);
//        order2.setOrderStatus("Delivered");
//        order2.setShippingAddress("124 Residential");
//        order2.setCustomer(c2);     //Sara
//        order2.setProduct(p2);      //iphone
//
//        orders.add(order1);
//        orders.add(order2);
//    }
//
//    public List<Product> getProducts() {
//        return products;
//    }
//
//    public List<Customer> getCustomers() {
//        return customers;
//    }
//
//    public List<Order> getOrders() {
//        return orders;
//    }
//
//    public void addProduct(Product product) {
//        products.add(product);
//    }
//
//    public void addCustomer(Customer customer) {
//        customers.add(customer);
//    }
//
//    public void addOrder(Order order) {
//        orders.add(order);
//    }
//    public Customer getCustomerById(int id) {
//        for (Customer customer : customers) {
//            if (customer.getId() == id) {
//                return customer;
//            }
//        }
//        return null;
//    }
//
//    public Product getProductById(int productId) {
//        for (Product product : products) {
//            if (product.getProductId() == productId) {
//                return product;
//            }
//        }
//        return null;
//    }
//}