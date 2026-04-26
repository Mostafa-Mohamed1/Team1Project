package org.example.esouq.controllers;

import jakarta.transaction.Transactional;
import org.example.esouq.Service.OrderService;
import org.example.esouq.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/api/order")
    @CrossOrigin(origins = "*")
    public class OrderController {

        @Autowired
        private OrderService orderService;

        // GET all orders
        @GetMapping
        public List<Order> getAllOrders(){
            return orderService.getAllOrders();
        }

        // GET order by id
        @GetMapping("/{id}")
        public ResponseEntity<Order> getOrderById(@PathVariable int id){
            return orderService.getOrderById(id)
                    .map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
        }

        // search order by the status
        @GetMapping("/search")
        public List<Order> searchOrderByStatus(String name){
            return orderService.getOrdersByStatus(name);
        }

        // create a new order
        @PostMapping
        public Order addOrder(@RequestBody Order order){
            orderService.saveOrder(order);
            return order;
        }

        //updates existing Order
        @PutMapping("/{id}")
        public ResponseEntity<Order> updateOrder(@PathVariable int id, @RequestBody Order order){
            order.setOrderId(id);
            return ResponseEntity.ok(orderService.saveOrder(order));
        }

        //deletes a Order
        @DeleteMapping("/{id}")
        @Transactional
        public ResponseEntity<Void> deleteOrder(@PathVariable int id) {
            orderService.deleteOrder(id);
            return ResponseEntity.noContent().build();
        }
    }

